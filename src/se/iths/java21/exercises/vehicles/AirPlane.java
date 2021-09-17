package se.iths.java21.exercises.vehicles;

import se.iths.java21.exercises.persons.*;

public class AirPlane extends AirBased {

    public AirPlane(int weight, int price, Person owner) {
        super(weight, price, owner);
    }

    public AirPlane() {
        super(44000, 44000000, new UnknownPerson());
    }
}
