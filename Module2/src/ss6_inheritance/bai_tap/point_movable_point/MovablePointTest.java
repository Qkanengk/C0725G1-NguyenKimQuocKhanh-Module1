package ss6_inheritance.bai_tap.point_movable_point;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(10,10,5,5);
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
