package se.iths.java21.objects;

public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point original){
        this.x = original.x;
        this.y = original.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        if (this == other)
            return 0.0;

        float dx = this.x - other.x;
        float dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point createPoint(){
        return new Point(0,0);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
