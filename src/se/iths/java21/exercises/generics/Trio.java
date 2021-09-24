package se.iths.java21.exercises.generics;

import se.iths.java21.exercises.vehicles.*;

public class Trio <T extends AirBased, U extends RoadBased, V extends Vehicle> {
    public T first;
    public U second;
    public V third;



    public static void main(String[] args) {
        Trio<AirPlane, Car, Car> vehicles = new Trio<>();

    }

}
