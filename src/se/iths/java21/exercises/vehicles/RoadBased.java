package se.iths.java21.exercises.vehicles;
 import se.iths.java21.exercises.persons.Person;

public abstract class RoadBased extends Vehicle {
    private int odometer;

    public RoadBased(int weight, int price, Person owner){
        super(weight, price, owner);
    }

    public int getOdometer(){
        return odometer;
    }

    public void drive(int kms){
        odometer += kms;
        System.out.printf("Drove: %d kms%n", odometer);
    }

}
