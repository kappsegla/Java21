package se.iths.java21.exercises.vehicles;

import java.util.Random;
import se.iths.java21.exercises.persons.Person;

public abstract class AirBased extends Vehicle{
    private int altitude;
    private final Random random = new Random();

    public AirBased(int weight, int price, Person owner) {
        super(weight, price, owner);
    }

    public void fly(boolean isFlying) {
        int addAlt = random.nextInt(10000);

        if (isFlying) {
            altitude += addAlt;
            System.out.println("Going up " + addAlt + " feet..." +
                    "\nCurrent Altitude: " + altitude);
        } else {
            altitude = 0;
            System.out.println("Landing...");
        }
    }

    public int getAltitude() {
        return altitude;
    }
}
