package se.iths.java21.exercises.chapter6;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore1 = Semaphore.request();
        Semaphore semaphore2 = Semaphore.request();
        Semaphore semaphore3 = Semaphore.request();
        Semaphore semaphore4 = Semaphore.request();
        Semaphore semaphore5 = Semaphore.request();
        Semaphore semaphoreNull = Semaphore.request();
        if( semaphoreNull == null)
            System.out.println("Game is full, no more players");

        System.out.println(semaphore5);
        System.out.println(semaphoreNull);
        semaphore5.release();
        semaphore5 = null;
        Semaphore semaphore6 = Semaphore.request();
        System.out.println(semaphore6);
    }
}
