package se.iths.java21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Alt:1 reading a number
        //    int value = scanner.nextInt();
        //    scanner.nextLine();
        //Alt:2 reading a number
        //    int value2 = Integer.parseInt(scanner.nextLine());

        //Reading a float value
        //    float value3 = Float.parseFloat(scanner.nextLine());

        //Reading a text line
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("How many years have you been using Java?");
        int yearsOfJavaProgramming = Integer.parseInt(scanner.nextLine());

        if (yearsOfJavaProgramming > 5)
            System.out.println("You must be a senior programmer.");
        else
            System.out.println("You are a junior programmer");
    }

    public static void elseif() {
        int value = 1;

        if (value == 1)
            System.out.println("Number one");
        else if (value == 2)
            System.out.println("Number two");
        else
            System.out.println("Other number");


        switch (value) {
            case 1:
                System.out.println("Number one");
                break;
            case 2:
                System.out.println("Number two");
                break;
            default:
                System.out.println("Other number");

        }

        switch (value) {
            case 1 -> System.out.println("Number one");
            case 2 -> System.out.println("Number two");
            default -> System.out.println("Other number");
        }
    }

}