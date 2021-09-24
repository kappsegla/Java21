package se.iths.java21.exercises.chapter6.animals;

import se.iths.java21.exercises.chapter6.NoiseMaker;

public class Robot implements NoiseMaker {

    @Override
    public void makeNoise() {
        System.out.println("Beep Boop");
    }
}
