package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Engineer;

import java.util.Scanner;

public class EngineerView extends EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getMajor() {
        System.out.println("Enter major");
        return scanner.nextLine();
    }

    public static String getLevel() {
        System.out.println("Enter level");
        return scanner.nextLine();
    }
    public static Employee getEmployee() {
        return new Engineer(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getMajor(), getLevel());
    }

}
