package se.iths.java21.exercises;

import se.iths.java21.exercises.persons.*;
import se.iths.java21.exercises.vehicles.AirPlane;
import se.iths.java21.exercises.vehicles.Car;

import java.math.BigDecimal;

public class VehicleDealer {
    public static void main(String[] args) {

        //Change money from float to BigDecimal
        Buyer buyer1 = new Buyer("Martin", 44, "Teacher", 1000_000_000);
        Buyer buyer2 = new Buyer("Albin", 12, "Pilot", 100);
        var buyer3 = new Buyer("Vimbay", 21, "Progammer", 350000);

        Seller seller1, seller2;
        seller1 = new Seller("Greger", 102, "Retired", 500);
        seller2 = new Seller("Elon Musk", 50, "SpaceX CEO", 161_000_000_000f);

        Dealer dealer1 = new Dealer("Hans", 65, 0);

        AirPlane plane1 = new AirPlane(44000,440000000,seller1);
        AirPlane helicopter = new AirPlane(1000,21000000,seller1);
        Car car1 = new Car(2900,450000,seller2);

        dealer1.changeOwner(plane1, buyer1);
        System.out.println(buyer1);
        System.out.println(plane1);
        System.out.println(seller1);
        System.out.println(dealer1);


    }
}
