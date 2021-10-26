package se.iths.java21.patterns.behavioral.memento;

import se.iths.java21.patterns.behavioral.command.Command;
import se.iths.java21.patterns.behavioral.command.CommandDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MementoDemo {
    final static Scanner scanner = new Scanner(System.in);
    static int total = 0;

    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {

        while (true) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> MementoDemo.Undo();
                case 2 -> MementoDemo.DoPlus();
                case 3 -> MementoDemo.DoMinus();
            }
            System.out.println("Curren total: " + total);
        }
    }

    private static void DoMinus() {
        System.out.println("Enter value to substract:");
        int value = scanner.nextInt();
        deque.addLast(total);
        total -= value;
    }

    private static void DoPlus() {
        System.out.println("Enter value to add:");
        int value = scanner.nextInt();
        deque.addLast(total);
        total += value;
    }

    private static void Undo() {
        if( deque.isEmpty())
            return;
        total = deque.removeLast();
    }
}
