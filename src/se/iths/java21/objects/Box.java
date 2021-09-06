package se.iths.java21.objects;

public class Box {
    private int width;
    private int length;
    private int height;

    private boolean opaque;

    //Default Constructor
    public Box() {

    }

    public Box(int size) {
        width = size;
        length = size;
        height = size;
    }

    public Box(int width, int length, int height) {
        if (width < 0 || length < 0 || height < 0)
            throw new IllegalArgumentException();
        this.width = width;
        this.length = length;
        this.height = height;
    }

    //Copy constructor
    public Box(Box box){
        width = box.width;
        length = box.length;
        height = box.height;
        opaque = box.opaque;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0)
            throw new IllegalArgumentException();
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


