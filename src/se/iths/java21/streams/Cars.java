package se.iths.java21.streams;

import org.jetbrains.annotations.Unmodifiable;

import java.util.*;
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

    public List<Car> getCars(List<Long> ids){
        return cars.stream()
                //.filter(car -> ids.contains(car.id()) )
                .filter(car -> ids.stream().anyMatch(id -> id == car.id()) )
                .toList();
    }

    /**
     * Using HashSet instead of List increases performance for contains from O(n)
     * to O(1).
     */
    public List<Car> getCars(HashSet<Long> ids){
        return cars.stream()
                .filter(car -> ids.contains(car.id()) )
                .toList();
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
        return cars.stream()
                .map(Car::brand)
                .distinct()
                //.collect(Collectors.toSet()).stream()
                .toList();
    }

    public Optional<Car> firstCar(){
        return cars.stream().findFirst();
    }

    public Optional<Car> lastCar() {
        return cars.stream().reduce(  (first, second ) -> second );
    }

    public Map<String, Long> getNumberByBrand() {
        return cars.stream()
                .collect(Collectors.groupingBy(Car::brand,Collectors.counting()));
    }

    public static void main(String[] args) {
        Cars cars = new Cars();

            cars.addCar(new Car(1L, null, "Volvo", 2021, 570000));
            cars.addCar(new Car(2L, "V60", "Volvo", 2021, 520000));
            cars.addCar(new Car(3L, "Impreza", "Subaru", 2008, 98000));
            cars.addCar(new Car(4L, "Model 3", "Tesla", 2019, 472000));

        cars.getListOfBrands().forEach(System.out::println);
        System.out.println(cars.getNumberByBrand());
        cars.getCars(List.of(1L, 3L)).forEach(System.out::println);

        HashSet<Long> ids = new HashSet<>(List.of(1L,3L));
        cars.getCars(ids).forEach(System.out::println);

        cars.lastCar().ifPresent(System.out::println);

    }

}
