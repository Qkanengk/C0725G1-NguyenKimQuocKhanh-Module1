package class_object.bai_tap;

class Fan {
    private final byte slow = 1;
    private final byte medium = 2;
    private final byte fast = 3;
    private int speed = slow;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public byte getSlow() {
        return slow;
    }

    public byte getMedium() {
        return medium;
    }

    public byte getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        if (this.on) {
            System.out.print("Speed: " + this.getSpeed() + " Color: " + this.getColor() + " Radius: " + this.getRadius() + " is off");

        } else System.out.println(" Color: " + this.getColor() + " Radius: " + this.getRadius() + " is off");
    }
}

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5);


    }
}
