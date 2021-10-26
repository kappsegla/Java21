package se.iths.java21.patterns.structural.decorator;

public class FreshTomatoDecorator extends PizzaDecorator{
    public FreshTomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return getPizza().getDescription() + ", Fresh tomato";
    }

    @Override
    public int getCost() {
        return 5 + getPizza().getCost();
    }
}
