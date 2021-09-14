package se.iths.java21.objects.interfaces.dice;

public abstract class SuperDie implements Die {
    protected int currentSide;
    private int sides;

    public SuperDie(int sides) {
        currentSide = 1;
        this.sides = sides;
    }

    @Override
    public abstract void roll();

    @Override
    public int value() {
        return currentSide;
    }

    @Override
    public int numberOfSides() {
        return sides;
    }
}
