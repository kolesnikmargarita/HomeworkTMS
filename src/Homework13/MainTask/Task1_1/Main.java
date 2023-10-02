package Homework13.MainTask.Task1_1;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Вариант не по техническим деталям
         */
        Scanner scanner = new Scanner(System.in);
        String fileName;
        StringBuilder documentNumber = new StringBuilder();
        int symbol;
        HashSet<String> files = new HashSet<>(); // если для списка файлов использовать HashSet вместо ArrayList, это не даст выгоды при вводе пользователем несколько раз одного файла?
        HashSet<HashSetDocNumber> documentNumbers = new HashSet<>();
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
                        documentNumbers.add(new HashSetDocNumber(documentNumber));
                        documentNumber = new StringBuilder();
                        fileReader.read();
                    }
                }
                if (!documentNumber.isEmpty()) {
                    documentNumbers.add(new HashSetDocNumber(documentNumber));
                    documentNumber = new StringBuilder();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try(FileWriter fileWriter = new FileWriter(reportFile)) {
            for(HashSetDocNumber number : documentNumbers){
                number.setDescription();
                fileWriter.write(number.getDocumentNumber().toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
