package se.iths.java21.objects;

import javax.sound.sampled.BooleanControl;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.getWidth());
        Box box1 = new Box(1, 2, 3);
        box1.setWidth(2);
        System.out.println(box1.getWidth());

        //Difficult to copy a box with the normal constructor
        Box box2 = new Box( box1.getWidth(),box1.getLength(),box1.getHeight() );

        Box box3 = new Box(box1);


    }
}
