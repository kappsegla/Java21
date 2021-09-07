package se.iths.java21.objects;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4, 50, 14.5f, false);
        Vehicle vehicle2 = new Vehicle(6, 70, 10.5f, false);
        System.out.println(vehicle1);

        System.out.println(vehicle1.computeRange());
        System.out.println(vehicle2.computeRange());
        System.out.printf("Computed range %.2f for this vehicle.%n",vehicle1.computeRange());

    }
}
