package Homework12.MainTask;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        StringBuilder documentNumber = new StringBuilder();
        int symbol;
        System.out.print("Введите путь к файлу: ");
        fileName = scanner.nextLine();
        try(FileReader fileReader = new FileReader(fileName)) {
            while ((symbol = fileReader.read()) != -1) {
                if(symbol != '\r') {
                    documentNumber.append((char)symbol);
                } else {
                    checkDocumentNumber(documentNumber);
                    fileReader.read();
                }
            }
            if(!documentNumber.isEmpty()) {
                checkDocumentNumber(documentNumber);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean itIsADocument(String string) {
        return string.length() == 15 && (string.startsWith("docnum") || string.startsWith("contract"));
    }

    private static void checkDocumentNumber(StringBuilder documentNumber) {
        boolean validDocumentNumber;
        validDocumentNumber = itIsADocument(documentNumber.toString());
        System.out.println(documentNumber.append("       - ").append(validDocumentNumber));
        documentNumber.delete(0, documentNumber.length());
    }
}
