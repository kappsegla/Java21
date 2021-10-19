package se.iths.java21.testdouble;

public class Car {
    //Dependency
    Monitor monitor;

    //Constructor Dependency injection
    public Car(Monitor monitor){
        this.monitor = monitor;
    }

    //Method Dependency injection
    public Car setMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public int getOutsideTemp(){
        return monitor.getTemperature();
    }
}
