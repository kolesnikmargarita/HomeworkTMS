package Homework10.MainTask;

public class Methods {

    public static void displayEightNumbers(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber, 0, 4).append(documentNumber, 9, 13).append("\n");
        System.out.println(result.toString());
    }

    public static void displayDocumentNumberWithStars(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber).replace(13, 16, "***")
                .replace(22, 25, "***").append("\n");
        System.out.println(result.toString());
    }

    public static void displayLettersInLowerCase(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append(documentNumber.substring(5, 8).toLowerCase()).append("/")
                .append(documentNumber.substring(14, 17).toLowerCase()).append("/")
                .append(documentNumber.substring(19, 20).toLowerCase()).append("/")
                .append(documentNumber.substring(21, 22).toLowerCase()).append("\n");
        System.out.println(result);
    }

    public static void displayLettersInUpperCase(String documentNumber) {
        StringBuilder result = new StringBuilder("Result:\n");
        result.append("Letters:").append(documentNumber.substring(5, 8).toUpperCase()).append("/")
                .append(documentNumber.substring(14, 17).toUpperCase()).append("/")
                .append(documentNumber.substring(19, 20).toUpperCase()).append("/")
                .append(documentNumber.substring(21, 22).toUpperCase()).append("\n");
        System.out.println(result);
    }

    public static void displayHaveABC(String documentNumber) {
        if(documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Номер документа содержит последовательность abc");
        } else {
            System.out.println("Номер документа не содержит последовательность abc");
        }
    }

    public static void displayStartsSequence(String documentNumber) {
        if(documentNumber.startsWith("555")) {
            System.out.println("Номер документа начинается с последовательности 555");
        } else {
            System.out.println("Номер документа не начинается с последовательности 555");
        }
    }

    public static void displayEndsSequence(String documentNumber) {
        if(documentNumber.endsWith("1a2b")) {
            System.out.println("Номер документа закансивается последовательностью 1a2b");
        } else {
            System.out.println("Номер документа не закансивается последовательностью 1a2b");
        }
    }
}