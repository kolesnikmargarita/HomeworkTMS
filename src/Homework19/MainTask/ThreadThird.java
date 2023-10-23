package Homework19.MainTask;

public class ThreadThird extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 3 is starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread 3 is finalized");
    }
}
