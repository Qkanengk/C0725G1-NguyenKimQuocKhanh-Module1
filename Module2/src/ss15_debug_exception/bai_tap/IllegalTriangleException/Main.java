package ss15_debug_exception.bai_tap.IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(0,2,3);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
