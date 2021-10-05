package se.iths.java21.threads;

import java.util.Arrays;

public class MultiThreadArray {
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException {

        MultiThreadArray multiThreadArray = new MultiThreadArray();

        Thread thread1 = new Thread(() -> multiThreadArray.multiplyByTwo(0, 4));
        Thread thread2 = new Thread(() -> multiThreadArray.multiplyByTwo(5, 9));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        Arrays.stream(multiThreadArray.numbers).forEach(System.out::println);
    }


    public void multiplyByTwo(int start, int end) {
        for (int i = start; i <= end; i++) {
            numbers[i] = numbers[i] * 2;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
