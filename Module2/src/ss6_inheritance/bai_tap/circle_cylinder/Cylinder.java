package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    Cylinder() {

    }

    Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public String toString() {
        return "A cylinder with radius = " + this.getRadius() + ", height = " + this.getHeight() + " is a subClass of " + super.toString();
    }
}
