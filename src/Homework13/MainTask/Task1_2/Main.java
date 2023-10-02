package Homework13.MainTask.Task1_2;

import Homework13.MainTask.Task1_1.HashSetDocNumber;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         * Вариант по техническим деталям
         */
        Scanner scanner = new Scanner(System.in);
        String fileName;
        StringBuilder documentNumber = new StringBuilder();
        int symbol;
        ArrayList<String> files = new ArrayList<>();
        HashSet<String> documentNumbers = new HashSet<>();
        HashMap<String, String> docDescription = new HashMap<>();
        File reportFile = new File("src/Homework13/MainTask/files/reportFile.txt");
        while(true) {
            System.out.print("Введите путь к файлу: ");
            fileName = scanner.nextLine();
            if(fileName.equals("0")){
                break;
            }
            files.add(fileName);
        }
        for(String file : files){
            try (FileReader fileReader = new FileReader(file)) {
                while ((symbol = fileReader.read()) != -1) {
                    if (symbol != '\r') {
                        documentNumber.append((char) symbol);
                    } else {
                        documentNumbers.add(documentNumber.toString());
                        documentNumber = new StringBuilder();
                        fileReader.read();
                    }
                }
                if (!documentNumber.isEmpty()) {
                    documentNumbers.add(documentNumber.toString());
                    documentNumber = new StringBuilder();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        for(String number : documentNumbers){
            docDescription.put(number, getDescription(number));
        }
        try(FileWriter fileWriter = new FileWriter(reportFile)) {
            //fileWriter.write(docDescription.toString());
            /*если записыватьь в файл через
            цыкл (как сказано в технических деталях), то для чего вообще HeshMap, если можно
            сделать цыкл на HeshSet и на каждой итерации сразу после добавления номера вычислять
            и вводить описание (как в коде в коменте ниже), а не вытаскивать его из значения при ключе?*/
            /*for(String number : documentNumbers) {
                fileWriter.write(number);
                fileWriter.write(getDescription(number));
            }*/
            for(String number : docDescription.keySet()) {
                fileWriter.write(number);
                fileWriter.write(docDescription.get(number));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getDescription(String documentNumber) {
        boolean validNumber = true;
        StringBuilder description = new StringBuilder();
        if(documentNumber.length() != 15){
            description.append(" - Невалиден: номер документа должен иметь длину 15 символов;");
            validNumber = false;
        }
        if(!documentNumber.toString().startsWith("docnum") && !documentNumber.toString().startsWith("kontract")){
            if (validNumber){
                description.append(" - Невалиден: ");
            }
            description.append("номер документа должен начинаться с \"docnum\" или с \"kontract\"");
            validNumber =false;
        }
        if(validNumber) {
            description.append(" - Валиден");
        }
        description.append('\n');
        return description.toString();
    }
}
