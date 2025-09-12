package ss4_class_object.bai_tap;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c) )/ 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c) )/ 2 * a;
    }

    public void cal() {
        if (this.getDiscriminant() < 0) {
            System.out.println("The equation has no real roots");
        } else if (this.getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots x1 = " + getRoot1() + " and x2 = " + getRoot2());
        } else System.out.println("The equation has 1 root x1 = " + getRoot1());
    }

}


public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation(1, 2, 3);
        System.out.println(a.getDiscriminant());
        a.cal();
    }
}
