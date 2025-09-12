package ss5_static_access_modifier.bai_tap.b1_circle_class;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){

    }
    Circle(double r){
        radius = r;
    }
    public void getRadius(){
        System.out.println("Radius: "+radius);
    }
    public void getArea(){
        System.out.println("Area: "+Math.PI*radius*radius);
    }

}
