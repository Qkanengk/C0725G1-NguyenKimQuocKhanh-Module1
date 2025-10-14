package bai_tap_them.quan_ly_nhan_su_cong_ty.view;


import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Engineer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate.LevelValidate;

import java.util.Scanner;

public class EngineerView extends EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getMajor() {
        System.out.println("Enter major");
        return scanner.nextLine();
    }

    public static String getLevel() {
        String level;
        do {
            System.out.println("Enter level");
            level = scanner.nextLine();
        } while (!(LevelValidate.validate(level)));
        return level;
    }
    public static Employee getEmployee() {
        return new Engineer(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getMajor(), getLevel());
    }

}
