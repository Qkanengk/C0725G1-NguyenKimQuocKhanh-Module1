package ss7_abstract_interface.bai_tap.colorable_for_shape;



public class ColorableShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        for(Shape shape:shapes){
            System.out.println(shape);
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }

    }
}
