package se.iths.java21.objects.interfaces;


public class Demo {
    public static void main(String[] args) {

        Pet myPet = new Cat();
    }
}

class Cat implements Pet, LandBound{

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public float runningSpeed() {
        return 25.0f;
    }
}

interface Pet {
    boolean isCute();
}

interface LandBound {
    float runningSpeed();
}
