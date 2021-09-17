package se.iths.java21.exercises.chapter6.task1to3;

public class Chapter6 {
    public static void main(String[] args) {
        GeneralClass gi = new GeneralClass(1);
        GeneralClass si = new SubClass("Test");
                
        gi.print();
        si.print();
    }
}
