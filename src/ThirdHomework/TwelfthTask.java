package ThirdHomework;

public class TwelfthTask {

    public static void main(String[] args) {

        int element0 = 1;
        int element1 = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.print(element1 + " ");
            element0 += element1;
            System.out.print(element0 + " ");
            element1 += element0;
        }
        System.out.print(element1 + " ");
    }
}
