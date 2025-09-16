package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparator;

public class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        super(side, side);
    }

    Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
