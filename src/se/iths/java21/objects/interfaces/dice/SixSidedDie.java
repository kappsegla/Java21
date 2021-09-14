package se.iths.java21.objects.interfaces.dice;

import java.util.Random;

public class SixSidedDie extends SuperDie{
    private Random random;

    public SixSidedDie(){
        super(6);
        random = new Random();
    }

    @Override
    public void roll() {
        currentSide = random.nextInt(6) + 1;
    }
}
