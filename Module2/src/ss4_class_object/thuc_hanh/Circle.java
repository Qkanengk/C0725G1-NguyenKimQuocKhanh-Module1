package ss4_class_object.thuc_hanh;

class Circle {
    double radius = 1;
    Circle(){
    }
    Circle(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        circle1.setRadius(100.0);
        System.out.println(circle1.getRadius());
    }
}
