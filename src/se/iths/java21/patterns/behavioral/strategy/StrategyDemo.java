package se.iths.java21.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Person person = new Person("Kalle",27);
        PrintingStrategy printingStrategy = new SameLinePrinting();

        printingStrategy.print(person);

        printingStrategy = new MultiLinePrinting();
        printingStrategy.print(person);


    }
}
