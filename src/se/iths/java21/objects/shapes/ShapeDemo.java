package se.iths.java21.objects.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        CylinderInheritance cylinder = new CylinderInheritance(1.0f, 1.0f);

        Circle circle1 = cylinder;
        Object obj = cylinder;

        System.out.println(obj.toString());
        System.out.println(circle1.toString());
        System.out.println(cylinder.toString());

    }

    public static double calculateArea(Circle circle) {
        return circle.area();
    }
}
