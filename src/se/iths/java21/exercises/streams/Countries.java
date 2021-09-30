package se.iths.java21.exercises.streams;

public class Countries {
    public static void main(String[] args) {
        List<Country> countries = getCountries();

        // task2(countries);
        // task3(countries).forEach(System.out::println);
        // task4(countries);
        task5(countries);
        task6(countries);
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

    private static void task3(List<Country> countries) {

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
