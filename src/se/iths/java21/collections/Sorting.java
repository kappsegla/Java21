package se.iths.java21.collections;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new House(7,100000));
        houses.add(new House(1,200000));
        houses.add(new House(3,500000));
        houses.add(new House(4,1000000));
        houses.add(new House(2,50000));

        houses.forEach(System.out::println);
        System.out.println("===Sorted===");
        houses.sort((o1, o2) -> o1.getRooms() - o2.getRooms() );
        houses.forEach(System.out::println);

//        for (int i = 0; i < houses.size(); i++) {
//            System.out.println(houses.get(i));
//        }
    }


}

class House {
    private int rooms;
    private int price;

    public House(int rooms, int price) {
        this.rooms = rooms;
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return rooms == house.rooms && price == house.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, price);
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", price=" + price +
                '}';
    }
}
