package se.iths.java21.objects.interfaces.commands;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    private final Command[] commands = new Command[4];

    public Menu() {
        commands[1] = new NameCommand();
        commands[2] = new Command() {
            @Override
            public void execute() {
                System.out.println(Math.random());
            }
        };
        commands[3] = () -> System.out.println("Moose");
        commands[0] = () -> System.out.print("");
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
        commands[choice].execute();
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
