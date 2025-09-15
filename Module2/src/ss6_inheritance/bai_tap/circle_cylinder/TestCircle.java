package ss6_inheritance.bai_tap.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(3,1);
        System.out.println(cylinder.getVolume());
    }
}
