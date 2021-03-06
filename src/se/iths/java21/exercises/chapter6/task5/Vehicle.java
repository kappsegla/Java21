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
//      Needs java 17
//        switch(vehicle) {
//            case Car car -> car.burnOut(10);
//
//        }
        if (vehicle instanceof Car theCar)
            theCar.burnOut(10);
        else if (vehicle instanceof Bicycle bicycle)
            bicycle.ringBell();
        else if (vehicle instanceof Boat boat)
            boat.startBoat();
        else if (vehicle instanceof Motorboat theMotorboat)
            theMotorboat.startEngine();
        else if (vehicle instanceof Sail sailBoat)
            sailBoat.raiseSail();
    }
}

class Bicycle extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med cykel till " + destination);
    }

    public void ringBell() {
        System.out.println("Pling Pling");
    }
}

class Boat extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med båt till " + destination);
    }

    public void startBoat() {
        System.out.println("Start boat");
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
    
    public void startEngine(){}
}

class Sail extends Vehicle {
    @Override
    public void goTo(String destination) {
        System.out.println("Färdas med segelbåt till " + destination);
    }

    public void raiseSail() {
    }
}