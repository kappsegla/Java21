package se.iths.java21.streams;

import java.util.Objects;

public final class Car {
    private final long id;
    private final String model;
    private final String brand;
    private final int year;
    private final int price;

    public Car(long id, String model, String brand, int year, int price) {
        //Guard clause
        Guard.Against.NullOrEmpty(model);
        Guard.Against.Null(brand);
        Guard.Against.YearOutsideValidRange(year);
        Guard.Against.ZeroOrLess(price);

        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;

    }

    public long id() {
        return id;
    }

    public String model() {
        return model;
    }

    public String brand() {
        return brand;
    }

    public int year() {
        return year;
    }

    public int price() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Car) obj;
        return this.id == that.id &&
                Objects.equals(this.model, that.model) &&
                Objects.equals(this.brand, that.brand) &&
                this.year == that.year &&
                this.price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand, year, price);
    }

    @Override
    public String toString() {
        return "Car[" +
                "id=" + id + ", " +
                "model=" + model + ", " +
                "brand=" + brand + ", " +
                "year=" + year + ", " +
                "price=" + price + ']';
    }


}
