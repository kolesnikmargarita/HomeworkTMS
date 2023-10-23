package Homework19.MainTask;

public class ThreadFirst extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 1 is starts");
        for(int i = 0; i < 50; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Thread 1 is finalized");
    }
}
