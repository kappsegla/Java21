package se.iths.java21.exercises;

import java.util.Scanner;

public class Chapter1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task7();
    }

    public static void task2() {
        System.out.println("Hej, vad heter du?");
        String name = scanner.nextLine();
        System.out.println("Hej " + name + "!");
    }

    public static void task3() {
        System.out.println("Hej, vad heter du?");
        String name = scanner.nextLine();
        System.out.println("Hej " + name + "!");
        System.out.println("Välj ett tal");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("Du valde talet " + value);
    }

    public static void task4() {
        System.out.println("Skriv in två tal!");
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = number1 + number2;
        System.out.println("Summan är " + sum);
        System.out.println("Produkt är " + (number1 * number2));
    }

    public static void task5() {
        System.out.println("Skriv ett decimaltal");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        int intValue = (int) Math.round(doubleValue);
        System.out.println("Ditt decimaltal (" + doubleValue + ") avrundades till " + intValue);
    }

    private static void task6() {
        System.out.println("Skriv ett tal");
        int value1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Skriv ytterligare ett tal");
        int value2 = Integer.parseInt(scanner.nextLine());
        int sum = value1 + value2;
        double meanValue = sum / 2.0;
        System.out.println("Medelvärdet av dina tal blir " + meanValue);

    /* Med double:
        System.out.println("Skriv ett nummer:");
        double firstNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Skriv ett till nummer:");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double medel = (firstNumber + secondNumber)/2;

        System.out.println("Medelvärdet av dessa nummer är: " + medel);
    */
    }

    private static void task7() {
        System.out.println("Hur mycket pengar har du på ditt konto?: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.println("Vilken räntesats? (om räntan är 2% anger du 0.02): ");
        double interestRate = Double.parseDouble(scanner.nextLine());

        balance *= (interestRate + 1.0);
        System.out.printf("Ditt nya saldo är: %.2f", balance);

//        System.out.println("Hur mycket pengar har du på ditt bankkonto?");
//        double value1 = Double.parseDouble(scanner.nextLine());
//        System.out.println("Hur många procent ränta är det? Skriv som decimaltal");
//        double value2 = Double.parseDouble(scanner.nextLine());
//        double sum;
//        if (value2 < 1) {
//            sum = value1 * (value2 + 1);
//        } else {
//            sum = value1 * value2;
//        }
//        System.out.println("Ditt nya saldo blir " + sum + " efter ränta");

    }
}

