package se.iths.java21.exercises.persons;

import org.junit.jupiter.api.Test;
import se.iths.java21.exercises.vehicles.AirPlane;
import se.iths.java21.exercises.vehicles.Car;

import static org.junit.jupiter.api.Assertions.*;

class DealerTest {

    @Test
    void changeOwnerChangesOwnerAndTransfersMoney() {
        //Arrange - set up every object needed for the test
        Buyer buyer1;
        buyer1 = new Buyer("Martin", 44, "Teacher", 100);
        Seller seller1;
        seller1 = new Seller("Greger", 102, "Retired", 0);

        Dealer dealer1 = new Dealer("Hans", 65, 0);

        AirPlane plane1 = new AirPlane(44000, 100, seller1);

        //Act - make the call.
        dealer1.changeOwner(plane1, buyer1);

        //Assert - verify the state after changeOwner
        assertEquals(buyer1, plane1.getOwner());
        assertEquals(85.0f, seller1.getMoney(), 0.001f);
        assertEquals(15.0f, dealer1.getMoney(), 0.001f);
        assertEquals(0.0f, buyer1.getMoney(), 0.001f);
    }

}