package se.iths.java21.objects.shapes;

public class CylinderInheritance extends Circle {

    private float height;

    public CylinderInheritance(float radius, float height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return super.area() * 2.0 + circumference() * height;
    }

    @Override
    public String toString() {
        return "CylinderInheritance{" +
                "radius=" + getRadius()+
                ", height=" + height +
                '}';
    }
}
