package se.iths.java21.objects.interfaces.commands;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final Command com1;
    private final Command com2;
    private final Command com3;

    public Menu() {
        com1 = new NameCommand();
        com2 = new Command() {
            @Override
            public void execute() {
                System.out.println(Math.random());
            }
        };
        com3 = () -> System.out.println("Moose");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }

    private void run() {
        int choice = 0;
        do {
            printMenuOption();
            choice = readChoice(scanner);
            executeChoice(choice);
        } while (choice != 0);
    }

    private void executeChoice(int choice) {
        switch (choice) {
            case 1 -> com1.execute();
            case 2 -> com2.execute();
            case 3 -> com3.execute();
            default -> System.out.print("");
        }
    }

    private int readChoice(Scanner scanner) {
        return scanner.nextInt();
    }

    private void printMenuOption() {
        System.out.println("1. Print your name");
        System.out.println("2. Print a random number");
        System.out.println("3. Print an animal type");
        System.out.println("0. Exit program");
    }

}
