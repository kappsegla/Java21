package se.iths.java21.exercises;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Chapter5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task12();
    }

    private static void task12() {
        System.out.println(returnStringReversedShort("Hejsan"));
    }

    private static String returnStringReversedShort(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    private static void task11() {
        System.out.println(sumOfNumbers());
        System.out.println(sumOfNumbers(100));
        System.out.println(sumOfNumbersRecursive(100));
    }

    private static int sumOfNumbersRecursive(int limit) {
        if( limit == 0)
            return 0;
        else
            return limit + sumOfNumbersRecursive(limit - 1);
    }

    private static int sumOfNumbers() {
        int sum = 0;
        int count = 1;

        while (count <= 100) {
            sum+=count;
            ++count;
        }

        return sum;
    }

    private static int sumOfNumbers(int limit) {
        int sum = 0;
        int count = 1;

        while (count <= limit) {
            sum+=count;
            ++count;
        }

        return sum;
    }


    private static void task10() {
        System.out.println(tempConvert(98.6));
    }

    private static double tempConvert(double fahrenheit) {
        return (fahrenheit-32) * 5 / 9;
    }

    private static void task9() {
        System.out.println(daysBetween("2000-02-01", "2000-03-01"));
    }

    private static int daysBetween(String date1, String  date2) {
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDate1 = LocalDate.parse(date2, DateTimeFormatter.ISO_LOCAL_DATE);
        int days = 0;
        days = (int) ChronoUnit.DAYS.between(localDate1, localDate2);
        return Math.abs(days);
    }

    private static void task8() {
        System.out.println(year("1998-07-28"));
    }

    public static int year(String date){
//        LocalDate parsedDate = LocalDate.parse(date);
//        return parsedDate.getYear();
        if( date.length() != 10)
            throw new IllegalArgumentException();

        return Integer.parseInt(date.substring(0,4));
    }

    private static String task7(String word) {
        return word.substring(0, 3);
    }

    private static void task6() {
        System.out.println(Month.JUN);
        System.out.println(Month.JUN.ordinal());

        Month input = Month.valueOf(scanner.next().toLowerCase().substring(0,3));
        System.out.println(input);
        System.out.println(daysInMonth(Month.JAN));
        if( input == Month.JAN)
            System.out.println("This is a cold month");
    }

    private static int daysInMonth(Month month) {
        return switch (month) {
            case JAN, MAR, MAY, JUL, OKT, DEC -> 31;
            case FEB -> leapYear();
            case APR, JUN, AUG, SEP, NOV -> 30;
        };
    }

    enum Month {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OKT,NOV,DEC}


    private static int leapYear() {
        if( Year.now().isLeap() )
            return 29;
        return 28;
    }

    private static void task5() {
        System.out.println(paragraph("Hej"));
    }

    private static String paragraph(String s) {
        return "<p>" + s + "</p>";
    }

    private static int task4(String text) {
        return Integer.parseInt(text);
    }

    private static void task3() {
        byte b = 5;
        userForm("Patrik", "G??teborg", b);
    }

    private static void userForm(String name, String town, byte favoriteNum) {
        System.out.println("V??lkommen " + name + " fr??n " + town + " med favoritnummer " + favoriteNum);
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
