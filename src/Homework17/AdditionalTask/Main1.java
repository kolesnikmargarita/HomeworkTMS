package Homework17.AdditionalTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    private static final HashMap<String, Document> result = new HashMap<>(){
        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            for(String key : this.keySet()) {
                result.append(key).append("\n").append(get(key));
            }
            return  result.toString();
        }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File directory;
        String[] files;
        StringBuilder resultMessage = new StringBuilder();
        int quantityOfViewableFiles;

        do {
            System.out.print("Введите путь к папке: ");
            directory = new File(scanner.nextLine());
            files = directory.list();
        } while(files == null);
        while(true) {
            System.out.print("Введите количество просматриваемых документов: ");
            if(scanner.hasNextInt()){
                quantityOfViewableFiles = scanner.nextInt();
                if(quantityOfViewableFiles > 0) {
                    break;
                }
            }
            scanner.hasNextLine();
        }
        if(files.length > 1) {
            if(!directory.toString().endsWith("\\")) {
                for(int i = 0; i < files.length; i++) {
                    files[i] = "\\" + files[i];
                }
            }
            resultMessage.append(processFiles(directory, files, quantityOfViewableFiles)).append(result);
        } else {
            resultMessage.append("Папка пуста.");
        }
        System.out.println(resultMessage);
    }

    private static StringBuilder processFiles(File directory, String[] files, int quantityOfViewableFiles) {
        int quantityOfReviewedFiles = 0;
        Document fileDataClass;
        StringBuilder text = new StringBuilder();
        for (int i = 0; quantityOfReviewedFiles < quantityOfViewableFiles && i < files.length; i++) {
            if (Patterns.TXT_FILE.getPattern().matcher(files[i]).matches()) {
                try (FileInputStream fileInputStream = new FileInputStream(directory + files[i])) {
                    int symbol;
                    while ((symbol = fileInputStream.read()) != -1) {
                        text.append((char) symbol);
                    }
                    fileDataClass = new Document();
                    fileDataClass.setNumberOfDoc(setFileText(text, Patterns.DOC_NUMBER.getPattern()));
                    fileDataClass.setPhoneNumber(setFileText(text, Patterns.PHONE_NUMBER.getPattern()));
                    fileDataClass.setEmail(setFileText(text, Patterns.EMAIL.getPattern()));
                    result.put(files[i].substring(0, files[i].length() - 4), fileDataClass);
                    text.delete(0, text.length());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                quantityOfReviewedFiles++;
            }
        }
        if(quantityOfReviewedFiles == 0) {
            text.append("Текстовые файлы отсутствуют.");
        } else {
            text.append("\nКоличество обработанных файлов: ").append(quantityOfReviewedFiles)
                    .append("\nКоличество файлов невалидного формата: ").append(files.length - quantityOfReviewedFiles)
                    .append("\n");
        }
        return text;
    }

    private static ArrayList<String> setFileText(StringBuilder text, Pattern pattern) {
        ArrayList<String> fileData = new ArrayList<>();
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            fileData.add(matcher.group());
        }
        return fileData;
    }
}


