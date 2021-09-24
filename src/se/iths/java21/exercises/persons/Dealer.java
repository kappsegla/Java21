package se.iths.java21.exercises.persons;

import se.iths.java21.exercises.vehicles.Vehicle;

public class Dealer extends Person {
    private static final float COMMISSION = 0.15f;

    public Dealer(String name, int age, float money) {
        super(name, age, "Vehicle dealer", money);
    }

    public void changeOwner(Vehicle vehicle, Buyer buyer) {
        Person seller = vehicle.getOwner();
        settlePayment(buyer,seller,vehicle);
        vehicle.setOwner(buyer);
    }

    private void settlePayment(Buyer buyer, Person seller, Vehicle vehicle) {
        buyer.removeMoney(vehicle.getPrice());
        seller.addMoney(vehicle.getPrice() * (1 - COMMISSION));
        this.addMoney(vehicle.getPrice() * COMMISSION);
    }
}
