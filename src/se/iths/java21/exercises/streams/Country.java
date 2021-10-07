package se.iths.java21.exercises.streams;

public record Country(String countryName, String capital, double population, int area){
    public double getPopulation() {
        return population() * 1_000_000;
    }
}
