package se.iths.java21.objects.liskov;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,10);
        rectangle.setWidth(20);
        System.out.println(rectangle);

        Square square = new Square(1);
        square.setHeight(2);
        System.out.println(square);

        Rectangle rectangle1 = new Square(3);
        rectangle1.setWidth(5);
        System.out.println(rectangle1);

        printArea(rectangle1);
    }

    public static void printArea(Rectangle rectangle) {
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());
    }
}
