package se.iths.java21.threads;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        Thread thread = new Thread(PrintAndRead::printStuff);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Äntligen skrev du: " + text);
    }

    public static void printStuff(){
        while (true){
            System.out.println("Skriv något då!!!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}
