package se.iths.java21.testdouble;

public class TestDemo {
    public static void main(String[] args) {
        Car car = new Car(new Monitor());
        System.out.println(car.getOutsideTemp());
    }
}
