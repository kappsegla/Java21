package se.iths.java21.exercises;

import java.util.Random;
import java.util.Scanner;

public class Chapter4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task4();
    }

    private static void task4() {
        System.out.println("Skriv ett tal");
        int length = scanner.nextInt();
        int[] newArray = new int[length];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int value = random.nextInt(100);
            newArray[i] = value;
            sum += value;
            System.out.println(value);
        }

        double average = (double) sum / length;

        System.out.printf("Medelvärdet är %.2f", average);

    }

    private static void task3() {
        int[] numbers = new int[5];
        int largest = Integer.MIN_VALUE;
        int least = Integer.MAX_VALUE;
        int odds = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();

            if (numbers[i] % 2 != 0)
                odds++;
            if (numbers[i] > largest)
                largest = numbers[i];
            if (numbers[i] < least)
                least = numbers[i];
        }
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        System.out.println("Största talet är: " + largest);
        System.out.println("Det minsta talet är " + least);
        System.out.println("Det fanns " + odds + " udda tal.");
    }

    private static void task2() {


    }

    private static void task1() {
        String[] colorArray = {"gul", "grön", "orange", "blå", "grå"};

        for( String color : colorArray)
            System.out.println(color);

        //System.out.println(Arrays.toString(colorArray));
        }
    }

