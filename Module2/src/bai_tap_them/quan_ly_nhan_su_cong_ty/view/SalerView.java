package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Saler;

import java.util.Scanner;

public class SalerView extends EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getSales() {
        System.out.println("Enter sales");
        return scanner.nextLine();
    }

    public static String getCommission() {
        System.out.println("Enter commission");
        return scanner.nextLine();
    }

    public static Employee getEmployee() {
        return new Saler(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getSales(), getCommission());
    }
}
