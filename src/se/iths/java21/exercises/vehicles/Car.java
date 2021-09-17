package se.iths.java21.exercises.vehicles;

import se.iths.java21.exercises.persons.*; // CTRL + D = Duplicera rad :)



public class Car extends RoadBased {
    public Car(){
        super(3500, 100_000, new UnknownPerson());
    }
    public Car(int weight, int price, Person owner){
        super(weight, price, owner);
    }
}
