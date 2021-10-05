package se.iths.java21.threads;

public class ThreadsDemo {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new DoSomething());
        Thread thread2 = new Thread(new DoSomething());
//        thread1.setDaemon(true);
//        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        new DoSomething().run();
    }
}

class DoSomething implements Runnable{

    private int counter = 0;

    @Override
    public void run() {
        while(counter < 10) {
            System.out.println("This is thread "+ Thread.currentThread().getName() +": "+ counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}