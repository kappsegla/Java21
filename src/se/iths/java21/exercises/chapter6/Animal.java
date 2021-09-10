package se.iths.java21.exercises.chapter6;

public class Animal{

    public static void main(String[] args) {
        Object el1 = new Elephant();
        Animal el2 = new Elephant();
        Mammal el3 = new Elephant();
        Elephant el4 = new Elephant();
    }
}

class Fish extends Animal{

}
class Bird extends Animal{

}
class Mammal extends Animal{


}
class Salmon extends Fish{

}
class Woodpecker extends Bird{

}
class Elephant extends Mammal{

}

