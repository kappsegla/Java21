package se.iths.java21.objects.shapes;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public double circumference() {
        return radius * 2.0 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Float.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return (radius != +0.0f ? Float.floatToIntBits(radius) : 0);
    }
}
