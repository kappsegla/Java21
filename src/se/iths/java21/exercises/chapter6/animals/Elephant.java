package se.iths.java21.exercises.chapter6.animals;

import se.iths.java21.exercises.chapter6.NoiseMaker;

public class Elephant extends Mammal implements NoiseMaker {
    @Override
    public void makeNoise() {
        System.out.println("trumpeter");
    }
}
