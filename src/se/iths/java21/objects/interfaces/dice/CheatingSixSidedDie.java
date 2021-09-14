package se.iths.java21.objects.interfaces.dice;

public class CheatingSixSidedDie implements Die{
    @Override
    public void roll() {

    }

    @Override
    public int value() {
        return 6;
    }

    @Override
    public int numberOfSides() {
        return 6;
    }
}
