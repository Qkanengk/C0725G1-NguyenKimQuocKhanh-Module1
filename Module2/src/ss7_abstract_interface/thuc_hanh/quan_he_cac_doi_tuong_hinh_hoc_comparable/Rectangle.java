package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    Rectangle() {
    }

    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public String toString() {
        return "A Rectangle with width= " + getWidth() + "and length= " + getLength() + ", which is a subclass of " + super.toString();
    }
}
