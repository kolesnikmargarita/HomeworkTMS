package Homework18.MainTask;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        File inputFile;
        Scanner scanner = new Scanner(System.in);
        File directory;
        String[] files;
        int choice;
        do {
            System.out.print("Введите путь к документу: ");
            directory = new File(scanner.nextLine());
            files = directory.list();
        } while(files == null);
        int quantityOfXMLFiles = 0;
        for (String file : files) {
            if (file.endsWith(".xml")) {
                quantityOfXMLFiles++;
                if(quantityOfXMLFiles == 1){
                    System.out.print("Выберите вариант обработкт: SAX - 1 DOM - 2: ");
                    while(true) {
                        if(scanner.hasNextInt()) {
                            choice = scanner.nextInt();
                            if(choice == 1 || choice == 2) {
                                break;
                            }
                        }
                        System.out.println("Некорректный ввод, повторите попытку: ");
                        scanner.nextLine();
                    }
                    if (!directory.toString().endsWith("\\")) {
                        file = "\\" + file;
                    }
                    inputFile = new File(directory + file);
                    if(choice == 1) {
                        parseLineSAX(inputFile);
                    } else {
                        parseLineDOM(inputFile);
                    }
                }
            }
        }
        if(quantityOfXMLFiles == 0) {
            System.out.println("Ни одного xml файла");
        } else if(quantityOfXMLFiles > 1){
            System.out.println("Больше одного xml файла, данные первого файла записанны в файл In other file.txt");
        }
    }

    private static void parseLineSAX(File inputFile) {
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SAXParse saxp = new SAXParse();
            parser.parse(inputFile, saxp);
            try (FileWriter fileWriter = new FileWriter(saxp.getFileName().toString())) {
                fileWriter.write(saxp.getText().toString());
            } catch (IOException e) {
                System.out.println(e.getMessage() + "first");
            }
        } catch (IOException | SAXException | ParserConfigurationException e) {
            System.out.println(e.getMessage() + "second");
        }
    }

    private static void parseLineDOM(File inputFile) {
        StringBuilder fileName = new StringBuilder();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            try{
                NodeList nList = doc.getElementsByTagName("firstName");
                fileName.append(nList.item(0).getTextContent());
                nList = doc.getElementsByTagName("lastName");
                fileName.append("_").append(nList.item(0).getTextContent());
                nList = doc.getElementsByTagName("title");
                fileName.append("_").append(nList.item(0).getTextContent()).append(".txt");
                nList = doc.getElementsByTagName("line");
                for (int i = 0; i < nList.getLength(); i++) {
                    result.append(nList.item(i).getTextContent()).append("\n");
                }
            } catch (NullPointerException e) {
                fileName.delete(0, fileName.length());
                fileName.append("In other file.txt");
                result.append("Root element :").append(doc.getDocumentElement().getNodeName());
                Node node = doc.getDocumentElement();
                parse(node);
            }
            try(FileWriter fileWriter = new FileWriter(fileName.toString())){
                fileWriter.write(result.toString());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch(ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void parse(Node node) {
        NodeList elements = node.getChildNodes();
        NamedNodeMap attributes;
        for (int i = 0; i < elements.getLength(); i++) {
            attributes = elements.item(i).getAttributes();
            if (attributes != null) {
                result.append("\n\n").append(elements.item(i).getNodeName());
                for (int j = 0; j < attributes.getLength(); j++) {
                    result.append("\n").append(attributes.item(j).toString());
                }
                result.append("\n").append(elements.item(i).getTextContent());
                parse(elements.item(i));
            }
        }
    }
}
