package ss6_inheritance.bai_tap.point_movable_point;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(5,10);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.toString());
    }
}
