package se.iths.java21.exercises.chapter6.task5;

abstract public class Vehicle {
    public Vehicle() {

    }

    public void goTo(String destination) {
        System.out.println("Färdas till " + destination);
    }

    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle boat = new Boat();
        Vehicle car = new Car();
        Vehicle motorboat = new Motorboat();
        Vehicle sail = new Sail();

        bicycle.goTo("Mölndal");
        boat.goTo("Brännö");
        car.goTo("Malmö");
        motorboat.goTo("Vrångö");
        sail.goTo("Koster");

        checkInstanceOf(bicycle);
        checkInstanceOf(boat);
        checkInstanceOf(car);
        checkInstanceOf(motorboat);
        checkInstanceOf(sail);

    }

    static void checkInstanceOf(Vehicle vehicle) {
        if (vehicle instanceof Car)
            ((Car) vehicle).burnOut(10);
        else if (vehicle instanceof Bicycle)
            ((Bicycle) vehicle).ringBell();
        else if (vehicle instanceof Boat)
            ((Boat) vehicle).startBoat();
        else if (vehicle instanceof Motorboat)
            ((Motorboat) vehicle).startEngine();
        else if (vehicle instanceof Sail)
            ((Sail) vehicle).raiseSail();

    }


}

class Bicycle extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med cykel till " + destination);
    }
}

class Boat extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med båt till " + destination);
    }
}

class Car extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med bil till " + destination);
    }

    public void burnOut(int seconds) {
        System.out.println("Spinning the wheels for " + seconds + " seconds.");
    }
}

class Motorboat extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med motorbåt till " + destination);
    }
}

class Sail extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med segelbåt till " + destination);
    }
}