package se.iths.java21.threads;

import java.util.Arrays;

public class SingleThreadArray {

    private int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {

        SingleThreadArray singleThreadArray = new SingleThreadArray();
        singleThreadArray.multiplyByTwo();

        Arrays.stream(singleThreadArray.numbers).forEach(System.out::println);
    }


    public void multiplyByTwo(){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

}
