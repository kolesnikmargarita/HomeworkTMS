package Homework19.MainTask;

public class Main {

    public static void main(String[] args) {
        ThreadFirst threadFirst= new ThreadFirst();
        ThreadSecond threadSecond = new ThreadSecond();
        ThreadThird threadThird = new ThreadThird();
        threadThird.start();
        try {
            threadThird.join();
            threadSecond.start();
            threadSecond.join();
            threadFirst.start();
            threadFirst.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
