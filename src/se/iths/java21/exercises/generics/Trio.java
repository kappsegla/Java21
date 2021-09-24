package se.iths.java21.exercises.generics;

import se.iths.java21.exercises.vehicles.AirPlane;
import se.iths.java21.exercises.vehicles.Car;
import se.iths.java21.exercises.vehicles.RoadBased;
import se.iths.java21.exercises.vehicles.Vehicle;

public class Trio <T extends Vehicle, U extends Vehicle, V extends Vehicle> {
    public T first;
    public U second;
    public V third;



    public static void main(String[] args) {
        Trio<AirPlane, RoadBased, Car> vehicles = new Trio<>();

    }

}
