package Homework19.MainTask;

public class ThreadSecond extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 2 is starts");
        for(int i = 0; i < 50; i++){
            System.out.print("#");
        }
        System.out.println();
        System.out.println("Thread 2 is finalized");
    }
}
