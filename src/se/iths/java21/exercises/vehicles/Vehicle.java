package se.iths.java21.exercises.vehicles;

import se.iths.java21.exercises.persons.Person;

public abstract class Vehicle {
    private final int weight;
    private int price;
    private Person owner;

    public Vehicle(int weight, int price, Person owner){
        this.weight = weight;
        this.price = price;
        this.owner = owner;
    }

    public int getWeight(){
        return weight;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

}
