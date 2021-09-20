package se.iths.java21.generics;

import java.util.function.Predicate;

public class Functional {


    public static void printIfTrue(String text, Predicate<String> condition) {
        if (condition.test(text))
            System.out.println(text);
    }

    public static void main(String[] args) {
        String info = "This is a test";
        String info2 = "This is not";

        printIfTrue(info, s -> s.contains("test"));

        printIfTrue(info2, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("test");
            }
        });

        printIfTrue("Hej", s -> s.startsWith("H"));

    }

}
