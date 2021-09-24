package se.iths.java21.exercises.generics;

import java.util.ArrayList;
import java.util.List;

public class RandomDoubleValues {
    public static void main(String[] args) {
        List<Double> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomNumbers.add(Math.random() * 100);
        }

        randomNumbers.forEach((v) -> System.out.printf("%.2f%n", v));
    }
}
