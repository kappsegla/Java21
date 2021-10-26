package se.iths.java21.patterns.behavioral.strategy;

public class SameLinePrinting implements PrintingStrategy {
    @Override
    public void print(Person person) {
        System.out.println("Person with name " + person.name() + " is " + person.age() + " years old.");
    }
}
