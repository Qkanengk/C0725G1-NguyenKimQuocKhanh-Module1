package ss7_abstract_interface.thuc_hanh.quan_he_cac_doi_tuong_hinh_hoc_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] ComparableCircle = new ComparableCircle[3];
        ComparableCircle[0] = new ComparableCircle();
        ComparableCircle[1] = new ComparableCircle(3.2);
        ComparableCircle[2] = new ComparableCircle(3.0, "red", true);
        System.out.println("Pre-sorted: ");
        for (ComparableCircle comparableCircle:ComparableCircle) {
            System.out.println(comparableCircle);
        }

        Arrays.sort(ComparableCircle);

        System.out.println("After-sorted");
        for(ComparableCircle comparableCircle:ComparableCircle){
            System.out.println(comparableCircle);
        }
    }
}
