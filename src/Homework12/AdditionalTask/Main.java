package Homework12.AdditionalTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File validDocumentNumbersFile = new File("src/Homework12/documents/validDocumentNames.txt");
        File notValidDocumentNumbersFile = new File("src/Homework12/documents/notValidDocumentNames.txt");
        Scanner scanner = new Scanner(System.in);
        String fileName;
        StringBuilder documentNumber = new StringBuilder();
        int symbol;
        System.out.print("Введите путь к файлу: ");
        fileName = scanner.nextLine();
        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            FileOutputStream fileOutputStreamForValid = new FileOutputStream(validDocumentNumbersFile);
            FileOutputStream fileOutputStreamForNotValid = new FileOutputStream(notValidDocumentNumbersFile)) {
            while ((symbol = fileInputStream.read()) != -1) {
                if(symbol != '\r') {
                    documentNumber.append((char)symbol);
                } else {
                    if(itIsAValidDocumentNumber(documentNumber)) {
                        fileOutputStreamForValid.write(documentNumber.toString().getBytes(StandardCharsets.UTF_8));
                    } else {
                        fileOutputStreamForNotValid.write(documentNumber.toString().getBytes(StandardCharsets.UTF_8));
                    }
                    fileInputStream.read();
                    documentNumber.delete(0, documentNumber.length());
                }
            }
            if(!documentNumber.isEmpty()) {
                if(itIsAValidDocumentNumber(documentNumber)) {
                    fileOutputStreamForValid.write(documentNumber.toString().getBytes(StandardCharsets.UTF_8));
                } else {
                    fileOutputStreamForNotValid.write(documentNumber.toString().getBytes(StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean itIsAValidDocumentNumber(StringBuilder documentNumber) {
        boolean validNumber = true;
        if(documentNumber.length() != 15){
            documentNumber.append("          Номер документа должен иметь длину 15 символов;");
            validNumber = false;
        }
        if(!documentNumber.toString().startsWith("docnum") && !documentNumber.toString().startsWith("contract")){
            documentNumber.append("          Номер документа должен начинаться с \"docnum\" или с \"contract\"");
            validNumber =false;
        }
        documentNumber.append('\n');
        return  validNumber;
    }
}
