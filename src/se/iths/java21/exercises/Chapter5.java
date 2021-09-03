package se.iths.java21.exercises;

import java.util.Scanner;

public class Chapter5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task3();
    }

    private static void task3() {
        byte b = 5;
        userForm("Patrik", "Göteborg", b);
    }

    private static void userForm(String name, String town, byte favoriteNum) {
        System.out.println("Välkommen " + name + " från " + town + " med favoritnummer " + favoriteNum);
    }

    private static void task2() {
        System.out.printf("Add = %.2f\n", add(1.0, 1.2));
        System.out.println("Multi result: " + multi(2, 5, 10));
        System.out.println("Multi result: " + multi(new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println("Multi result: " + multi2(2, 3, 4, 5, 5, 6, 6, 3, 4, 3, 1));
    }

    private static double add(double x, double y) {
        return x + y;
    }

    public static int multi(int a, int b, int c) {
        return a * b * c;
    }

    public static int multi(int[] numbers) {
        int product = 1;

        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    //varargs (params)
    public static int multi2(int... numbers) {
        int product = 1;

        for (int number : numbers) {
            product *= number;
        }

        return product;
    }

}
