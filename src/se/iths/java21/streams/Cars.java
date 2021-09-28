package se.iths.java21.streams;

import org.jetbrains.annotations.Unmodifiable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        //Verify car before add
        cars.add(car);
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    public Optional<Car> findCarById(long carId) {
        return cars.stream()
                .filter(car -> car.id() == carId)
                .findAny();
    }

    public List<Car> findCarsByBrand(String brand) {
        return cars.stream()
                .filter(car -> car.brand().equals(brand))
                .toList();
    }

    public List<String> getListOfBrands() {
        return List.of();
    }


    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.addCar(new Car(1L, "XC90", "Volvo", 2021, 570000));
        cars.addCar(new Car(2L, "V60", "Volvo", 2020, 520000));
        cars.addCar(new Car(3L, "Impreza", "Subaru", 2008, 98000));
        cars.addCar(new Car(4L, "Model 3", "Tesla", 2019, 472000));


    }

}
