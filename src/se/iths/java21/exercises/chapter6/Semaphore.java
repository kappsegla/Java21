package se.iths.java21.exercises.chapter6;

public class Semaphore {
    private static final int MAX_OBJECTS = 5;
    private static final Counter counter = new Counter();
    //private static int counter;

    private Semaphore() {
    }

    public static Semaphore request() {
        if( counter.value() >= MAX_OBJECTS)
            return null;

        counter.increase();
        return new Semaphore();
    }

    public void release() {
        counter.decrease();
    }


}
