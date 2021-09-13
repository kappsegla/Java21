package se.iths.java21.objects.interfaces;


import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Cat myCat = Cat.of("Flinga");
        List<String> list = List.of("A","B","C");

        Pet myPet = myCat;
        Mammal myMammal = myCat;
        Dog dog = new Dog();

        System.out.println(myCat.talk());
        System.out.println(myMammal.talk());
        System.out.println(dog.talk());
    }
}

abstract class Mammal {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract String talk();
}

final class Cat extends Mammal implements Pet {

    private String name;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat of(String name){
        return new Cat(name);
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    String talk() {
        return "Mjau";
    }
}

class Dog extends Mammal{

    @Override
    String talk() {
        return "Voff";
    }
}


@FunctionalInterface
interface Pet {
   boolean isCute();
}

interface FeedablePet extends Pet {
    void feed();
}


interface MouseChase {
    float runningSpeed();
}

interface LandBound {
    float runningSpeed();
}
