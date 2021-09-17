package se.iths.java21.exercises.vehicles;

import java.util.Random;
import se.iths.java21.exercises.persons.*;

public abstract class WaterBased extends Vehicle {
    private GpsPosition gpsPosition;

    WaterBased(int weight, int price, Person owner) {
        super(weight, price, owner);
        gpsPosition = new GpsPosition();
    }

    public void go() {
        gpsPosition.updatePosition();
    }

    public GpsPosition getGpsPosition() {
        return new GpsPosition(gpsPosition);
    }

}

class GpsPosition {
    private double latitude;
    private double longitude;
    private final Random random;

    public GpsPosition(GpsPosition original) {
        this();
        this.longitude = original.longitude;
        this.latitude = original.latitude;
    }

    GpsPosition() {
        latitude = 0;
        longitude = 0;
        random = new Random();
    }

    public void updatePosition() {
        this.latitude = random.nextDouble() * 180 - 90;
        this.longitude = random.nextDouble() * 360 - 180;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}