package se.iths.java21.exercises.streams;

import org.jetbrains.annotations.NotNull;

import java.nio.Buffer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Countries {
    public static void main(String[] args) {
        List<Country> countries = getCountries();

        // task2(countries);
        // task3(countries).forEach(System.out::println);
        // task4(countries);
        //task5(countries);
        //task6(countries);
        //task7(countries);
        //task8(countries);
        //task9(countries);
        //task10(countries);
        //task11(countries);
        //task12(countries);
        //task13(countries);
        //task14(countries);
        //task15(countries);
        //task16(countries);
        //task17(countries);
        //task18(countries);
        task19(countries);
    }

    private static void task19(List<Country> countries) {
        double sumOfPopulation = countries.stream()
                .filter(country -> country.countryName().length() == 7)
                .mapToDouble(Country::population)
                .sum();
        System.out.println(sumOfPopulation);
    }

    private static void task18(List<Country> countries) {
        double firstSixSum = countries.stream()
                .mapToDouble(Country::population)
                .sorted()
                .limit(6)
                .sum();
        System.out.println(firstSixSum);

        double lastThreeSum = countries.stream()
                .map(Country::population)
                .sorted(Collections.reverseOrder())
          //      .sorted(Comparator.comparingDouble(Country::population).reversed())
                .limit(3)
                .mapToDouble(x -> x)
                .sum();
        System.out.println(lastThreeSum);

    }

    private static void task17(List<Country> countries) {
        countries.stream()
                .sorted(Comparator.comparing(Countries::getReverse))
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    @NotNull
    private static String getReverse(Country country) {
        return new StringBuilder(country.capital()).reverse().toString();
    }


    private static void task16(List<Country> countries) {
        countries.stream()
                .map(country -> new CnP(country.countryName(), country.population() * 1_000_000))
                .forEach(cnP -> System.out.printf("namn: %s, invånare: %.0f %n", cnP.name, cnP.population));

        countries.stream()
                .map(country -> new CountryAndPopDensity(country.countryName(),
                        country.population() * 1_000_000 / country.area()))
                .sorted(Comparator.comparing(CountryAndPopDensity::popPerSqKm))
                .forEach(System.out::println);
    }

    record CnP(String name, Double population) {
    }

    private static void task15(List<Country> countries) {



    }


    private static void task14(List<Country> countries) {
        var map = countries.stream()
                .collect(Collectors.groupingBy(c -> c.countryName().substring(0, 1), Collectors.counting()));

        System.out.println(map);
    }

    private static void task13(List<Country> countries) {
        //filter, sorted, limit, map, forEach
        countries.stream()
                .filter(country -> country.area() >= 500_000)
                .sorted(Comparator.comparing(Country::countryName).reversed())
                .limit(3)
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task12(List<Country> countries) {
        countries.stream()
                .filter(country -> country.population() > 7.0)
                .sorted(Comparator.comparingDouble(Country::population))
                .map(Country::countryName)
                .limit(4)
                .forEach(System.out::println);
    }

    private static void task11(List<Country> countries) {
        countries.stream()
                .sorted(Comparator.comparing(Country::population))
                .map(Country::countryName)
                .limit(5)
                .forEach(System.out::println);

    }

    private static void task10(List<Country> countries) {
        countries.stream()
                .filter(country -> country.countryName().length() > country.capital().length())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static void task9(List<Country> countries) {

        countries.stream()
                .filter(Countries::compareFirstLetter)
                .map(country -> new CountryNameAndCapital(country.countryName(), country.capital()))
                .forEach(System.out::println);
    }

    record CountryNameAndCapital(String countryName, String Capital) {
    }

    private static boolean compareFirstLetter(Country country) {
        return country.countryName().startsWith(country.capital().substring(0, 1));
    }

    private static void task8(List<Country> countries) {

        System.out.println("area over 10_000: " + countries.stream()
                .filter(country -> country.area() > 10_000).count());
        System.out.println("area over 100_000: " + countries.stream()
                .filter(country -> country.area() > 100_000).count());
        System.out.println("area over 1_000_000: " + countries.stream()
                .filter(country -> country.area() > 1_000_000).count());

    }

    private static void task7(List<Country> countries) {
        countries.stream()
                .filter(country -> country.population() < 5)
                .map(Country::countryName)
                .forEach(System.out::println);

    }

    private static void task6(List<Country> countries) {
        double averageArea = countries.stream()
                .mapToDouble(Country::area)
                .average()
                .orElse(0.0);

        long count = countries.stream()
                .filter(country -> country.area() < averageArea)
                .count();

        System.out.println(count);
    }

    private static void task5(List<Country> countries) {
        countries.stream()
                .mapToDouble(Country::population)
                .max()
//                .map(country -> country.population())
//                .max(Double::compare)
                .ifPresent(System.out::println);

    }

    private static void task4(List<Country> countries) {
        countries.stream()
                .sorted(Comparator.comparing(Country::population).reversed())
                .map(Country::countryName)
                .forEach(System.out::println);
    }

    private static List<String> task3(List<Country> countries) {
        return countries.stream()
                .map(Country::countryName)
                .sorted()
                .toList();
    }

    private static void task2(List<Country> countries) {
        countries.stream()
                .findFirst()
                .map(Country::countryName)
                .ifPresent(System.out::println);

        countries.stream()
                .reduce((first, second) -> second)
                .map(Country::countryName)
                .ifPresent(System.out::println);
    }

    @NotNull
    private static List<Country> getCountries() {
        return List.of(
                new Country("Sverige", "Stockholm", 10.07, 450295),
                new Country("Norge", "Oslo", 5.27, 323802),
                new Country("Island", "Reykyavik", 0.33, 102775),
                new Country("Danmark", "Köpenhamn", 5.75, 42931),
                new Country("Finland", "Helsinki", 5.51, 338424),
                new Country("Belgien", "Bryssel", 11.30, 30528),
                new Country("Tyskland", "Berlin", 82.18, 357168),
                new Country("Frankrike", "Paris", 66.99, 640679),
                new Country("Storbritannien", "London", 60.80, 209331),
                new Country("Niue", "Alofi", 0.0016, 261),
                new Country("Mongoliet", "Ulan Batar", 3.08, 1566000),
                new Country("Polen", "Warszawa", 38.63, 312679),
                new Country("Spanien", "Madrid", 46.5, 505990),
                new Country("Portugal", "Lissabon", 10.31, 92212),
                new Country("Italien", "Rom", 60.59, 301338),
                new Country("Grekland", "Aten", 11.18, 131957),
                new Country("Luxemburg", "Luxemburg", 0.58, 2586),
                new Country("Liechtenstein", "Vaduz", 0.038, 160)
        );
    }
}
