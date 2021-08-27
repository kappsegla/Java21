package se.iths.java21.exercises;

import java.util.Scanner;

public class Chapter2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task4();
    }

    private static void task3() {
        System.out.println("Ange ett lösenord: ");
//        String password = scanner.nextLine(); //this will write the password on the screen.

//        This is a better solution(password is not written on the screen)
//        however this does not work in intellij:
        String password = String.valueOf(System.console().readPassword());
        //String password = new String(System.console().readPassword());
        //String password = scanner.nextLine(); //this will write the password on the screen.

        System.out.println("Ange lösenordet igen: ");
        String possiblePassword = scanner.nextLine();

        if (password.equals(possiblePassword))
            System.out.println("That is correct");
        else
            System.out.println("That is wrong");
    }

    private static void task4() {
        System.out.println("Skriv ett tal");

        int number = Integer.parseInt(scanner.nextLine());

        if (number == 100)
            System.out.println("Ditt nummer är 100.");
        else if (number < 100)
            System.out.println("Ditt nummer är mindre än 100");
        else
            System.out.println("Ditt nummer är större än 100.");

    }

}
