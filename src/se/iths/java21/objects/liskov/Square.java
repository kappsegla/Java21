package se.iths.java21.objects.liskov;


//This is an example of violation of Liskov substitution principle
//A square is not a subclass to Rectangle.
//Use Shape as a superclass to both?
public class Square extends Rectangle {

    public Square(float sideLength) {
        super(sideLength,sideLength);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
