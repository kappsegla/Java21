package se.iths.java21.exercises;

import java.util.Scanner;

public class Chapter2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task7();
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

    private static void task5() {

        while (true) {
            System.out.println("Skriv en månad: ");
            String month = scanner.nextLine().toLowerCase();

            int monthNumber = switch (month) {
                case "januari" -> 1;
                case "februari" -> 2;
                case "mars" -> 3;
                case "april" -> 4;
                case "maj" -> 5;
                case "juni" -> 6;
                case "juli" -> 7;
                case "augusti" -> 8;
                case "september" -> 9;
                case "oktober" -> 10;
                case "november" -> 11;
                case "december" -> 12;
                default -> 0;
            };

            if (monthNumber == 0)
                System.out.println("Jag förstår inte vilken månad du menar, testa igen");
            else {
                System.out.println("Det är månad nummer " + monthNumber);
                break;
            }
        }
    }


    private static void task7() {

        for (int i = 0; i < 16; i++) {
            System.out.println(i + 1);
        }

        for (int i = 1; i <= 16; i++) {
            System.out.println(i);
        }

        int i = 0;
        while(i < 16){
            System.out.println(i+1);
            i++;
        }
    }
}
