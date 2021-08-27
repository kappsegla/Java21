package se.iths.java21.exercises;

public class Chapter1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task6();
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

    }

}

