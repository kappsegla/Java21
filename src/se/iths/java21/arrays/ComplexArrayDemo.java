package se.iths.java21.arrays;


import se.iths.java21.objects.Box;

public class ComplexArrayDemo {
    public static void main(String[] args) {
        Box[] boxes = new Box[3];

        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Box();

            //if( boxes[i] != null)  //If the reference is null don't use it.
            boxes[i].setWidth(10 * (i + 1));

            System.out.println(boxes[i].getWidth());
        }
    }
}
