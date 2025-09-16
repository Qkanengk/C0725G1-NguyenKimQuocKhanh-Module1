package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.2);
        circles[2] = new Circle(2,"pink", true);

        System.out.println("Pre-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
