package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Officer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Saler;

import java.util.Scanner;

public class OfficerView extends EmployeeView{
    private static Scanner scanner = new Scanner(System.in);

    public static String getWorkDays() {
        System.out.println("Enter work days");
        return scanner.nextLine();
    }

    public static String getSalaryCoefficient() {
        System.out.println("Enter salary coefficient");
        return scanner.nextLine();
    }
    public static Employee getEmployee() {
        return new Officer(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getWorkDays(), getSalaryCoefficient());
    }
}
