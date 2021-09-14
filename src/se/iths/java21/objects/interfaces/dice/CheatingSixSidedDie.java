package se.iths.java21.objects.interfaces.dice;

public class CheatingSixSidedDie extends SuperDie{

    public CheatingSixSidedDie() {
        super(6);
        currentSide = 6;
    }

    @Override
    public void roll() {

    }
}
