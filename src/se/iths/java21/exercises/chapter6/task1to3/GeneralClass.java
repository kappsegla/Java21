package se.iths.java21.exercises.chapter6.task1to3;

public class GeneralClass {
    private int number;

    public GeneralClass() {
        number = 0;
    }

    public GeneralClass(int number) {
        this.number = number;
    }

    public int number() {
        return number;
    }
    public void number(int number) {
        this.number = number;
    }

    public void print(){
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "GeneralClass{" +
                "number=" + number +
                '}';
    }

}
