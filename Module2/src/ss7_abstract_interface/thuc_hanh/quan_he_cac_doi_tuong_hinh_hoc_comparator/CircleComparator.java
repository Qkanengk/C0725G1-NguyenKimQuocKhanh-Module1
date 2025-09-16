package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparator;

import java.util.Comparator;


public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) {
            return 1;
        } else if (o1.getRadius() < o2.getRadius()) {
            return -1;
        }
        return 0;
    }


}
