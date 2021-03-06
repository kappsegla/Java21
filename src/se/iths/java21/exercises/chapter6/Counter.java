package se.iths.java21.exercises.chapter6;

public class Counter {
    private static int noOfObjects;
    private int counter;

    public Counter() {
        noOfObjects++;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public int value() {
        return counter;
    }

    public void objectCount(){
        System.out.println(noOfObjects);
    }


    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        counter.increase();
        counter.increase();
        System.out.println(counter.value());
        System.out.println(counter2.value());
        counter.objectCount();
    }
}
