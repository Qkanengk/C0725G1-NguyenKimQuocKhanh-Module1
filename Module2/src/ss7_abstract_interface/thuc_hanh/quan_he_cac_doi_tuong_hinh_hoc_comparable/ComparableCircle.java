package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    ComparableCircle() {

    }

    ComparableCircle(double radius) {
        super(radius);
    }

    ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else
            return 0;
    }
}
