package se.iths.java21.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    static ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        //ExecutorService executor = Executors.newSingleThreadExecutor();

        //System.out.println(Runtime.getRuntime().availableProcessors());
        //ExecutorService executor = Executors.newFixedThreadPool(2);

        //ExecutorService executor = Executors.newCachedThreadPool();

        //ExecutorService executor = Executors.newScheduledThreadPool()

        var result = executor.submit(()-> System.out.println("First task" + Thread.currentThread().getName()));
        executor.submit(()-> System.out.println("Second task" + Thread.currentThread().getName()));


        //Shutdown before exit.
        executor.shutdown();




    }
}
