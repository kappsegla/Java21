package se.iths.java21.objects;

/**
 * This class reprecents a Vehicle traveling on wheels.
 */
public class Vehicle {
    private int passengers;
    private int fuelCap;
    private float kmPerLiter;
    private boolean awd;

    /**
     *
     * @param passengers
     * @param fuelCap Current fuel capacity in litres.
     * @param kmPerLiter
     * @param awd
     */
    public Vehicle(int passengers, int fuelCap, float kmPerLiter, boolean awd) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.kmPerLiter = kmPerLiter;
        this.awd = awd;
    }

    public Vehicle(int passengers, int fuelCap, float kmPerLiter) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.kmPerLiter = kmPerLiter;
    }

    /**
     * Returns the current maximum calculated distance this Vehicle can travel.
     * @return Maximum distance in km.
     */
    public float computeRange(){
        return fuelCap * kmPerLiter;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public float getKmPerLiter() {
        return kmPerLiter;
    }

    public void setKmPerLiter(float kmPerLiter) {
        this.kmPerLiter = kmPerLiter;
    }

    public boolean isAwd() {
        return awd;
    }

    public void setAwd(boolean awd) {
        this.awd = awd;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengers=" + passengers +
                ", fuelCap=" + fuelCap +
                ", kmPerLiter=" + kmPerLiter +
                ", awd=" + awd +
                '}';
    }
}
