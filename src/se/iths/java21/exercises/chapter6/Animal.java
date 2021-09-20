package se.iths.java21.exercises.chapter6;

public class Animal{

    public static void main(String[] args) {
        Object el1 = new Elephant();
        Animal el2 = new Elephant();
        Mammal el3 = new Elephant();
        Elephant el4 = new Elephant();

        Animal animal = new Animal();
        Fish fish = new Fish();
        Animal animal1 = fish;

        animal.demo();
        fish.demo();
        animal1.demo();

        NoiseMaker noiseMaker = new Woodpecker();
        noiseMaker.makeNoise();

        NoiseMaker noiseMaker1 = new Robot();
        noiseMaker1.makeNoise();
    }

    public int test(){
        return 0;
    }

    public void demo(){
        System.out.println("Demo in Animal");

    }

}

class Fish extends Animal{

    public void demo() {
        System.out.println("Demo in Fish");
    }
}
class Bird extends Animal{

}
class Mammal extends Animal{

}
class Salmon extends Fish{

}
class Woodpecker extends Bird implements NoiseMaker{

    @Override
    public void makeNoise() {
        System.out.println("drum drum");
    }
}

class Elephant extends Mammal implements NoiseMaker{
    @Override
    public void makeNoise() {
        System.out.println("trumpeter");
    }
}

class Robot implements NoiseMaker {

    @Override
    public void makeNoise() {
        System.out.println("Robot making noise");
    }
}
