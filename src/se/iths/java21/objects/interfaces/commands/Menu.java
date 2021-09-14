package se.iths.java21.objects.interfaces.commands;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

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
      }while(choice != 0);
    }

    private void executeChoice(int choice) {
        switch(choice){
            case 1-> System.out.println("Martin");
            case 2-> System.out.println(Math.random());
            case 3-> System.out.println("Moose");
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
