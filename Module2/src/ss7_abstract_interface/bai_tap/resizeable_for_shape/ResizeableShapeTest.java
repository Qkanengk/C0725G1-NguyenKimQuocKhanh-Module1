package ss7_abstract_interface.bai_tap.resizeable_for_shape;

public class ResizeableShapeTest {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[5];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 2);
        shapes[2] = new Rectangle(2, 4);
        shapes[3] = new Circle(2);
        shapes[4] = new Rectangle(2, 1);

        for (Resizeable shape : shapes) {
            System.out.println("Before resize:");
            System.out.println(shape);
            System.out.println("After resize:");
            shape.resize((int) (Math.random() * 100));
        }
    }
}
