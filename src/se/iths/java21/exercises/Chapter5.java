package se.iths.java21.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Scanner;

public class Chapter5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       task10();
    }

    private static void task10() {
        System.out.println(tempConvert(98.1));
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
        System.out.println(Month.jun);
        System.out.println(Month.jun.ordinal());

        Month input = Month.valueOf(scanner.next().toLowerCase().substring(0,3));
        System.out.println(input);
        System.out.println(daysInMonth(Month.JAN));
        if( input == Month.JAN)
            System.out.println("This is a cold month");
    }

    private static int daysInMonth(Month getDays) {
        return switch (getDays) {
            case JAN -> 31;
            case feb -> 28;
            case mar -> 31;
            case apr -> 30;
            case maj -> 31;
            case jun -> 30;
            case jul -> 31;
            case aug -> 30;
            case sept -> 30;
            case okt -> 31;
            case nov -> 30;
            case dec -> 31;
        };
    }


    private static int leapYear() {
        if( Year.now().isLeap() )
            return 29;
        return 28;
    }

    private static void task5() {
        System.out.println(paragraph("Hej"));
    }

    private static String paragraph(String s) {
        String sTagged = "<p>" + s + "</p>";
        return sTagged;
    }

    private static int task4(String text) {
        return Integer.parseInt(text);
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
