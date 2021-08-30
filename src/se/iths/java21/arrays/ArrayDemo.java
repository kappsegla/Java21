package se.iths.java21.arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //To create this big array we need VM options: -Xms9G -Xmx9G
//        int[] ints = new int[Integer.MAX_VALUE - 5];
//        System.out.println(ints.length);
        //int[] array = {1,2,3,4,5};

        System.out.println("How many numbers do you want to enter?");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        int counter = 0;

        while(counter < array.length){
            System.out.println("Enter a value: ");
            array[counter++] = scanner.nextInt();
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter a value: ");
//            array[i] = scanner.nextInt();
//        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if( i > 0)
                System.out.println("Previous value is: " +  array[i -1]);
        }

        for (int value : array) {
            System.out.println(value);
         }
    }
}
