package Homework13.AdditionalTask;

public class Main {

    public static void main(String[] args) {
        NewArrayList<String> testArray = new NewArrayList<>();
        System.out.println(testArray);
        testArray.add("Element with index 0");
        testArray.add("Element with index 1");
        testArray.add("Element with index 2");
        testArray.add("Element with index 3");
        testArray.add("Element with index 4");
        testArray.add("Element with index 5");
        System.out.println(testArray);
        testArray.add("Element with index 6");
        testArray.add("Element with index 7");
        testArray.remove(2);
        testArray.add("Element with index 8");
        testArray.add("Element with index 9");
        testArray.add("Element with index 10");
        testArray.add("Element with index 11");
        testArray.add("Element with index 12");
        testArray.add("Element with index 13");
        testArray.add("Element with index 14");
        System.out.println(testArray);
        System.out.println(testArray.get(11));
        System.out.println(testArray.get(56));
        System.out.println(testArray.contains("Element with index 13"));
        testArray.clear();
        System.out.println(testArray);
        testArray = new NewArrayList<>(3);
        testArray.add("new element, it's first in the array");
        System.out.println(testArray);
        testArray.add("it's 2 in the array");
        testArray.add("it's 3 in the array");
        testArray.add("it's 4 in the array");
        System.out.println(testArray);
    }
}
