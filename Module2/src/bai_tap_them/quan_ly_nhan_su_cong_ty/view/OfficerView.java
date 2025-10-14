package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Officer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate.SalaryCoefficientValidate;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate.WorkDayValidate;

import java.util.Scanner;

public class OfficerView extends EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getWorkDays() {
        String workDay;
        do {
            System.out.println("Enter work days");
            workDay = scanner.nextLine();
        } while (!WorkDayValidate.validate(workDay));
        return workDay;
    }

    public static String getSalaryCoefficient() {
        String salaryCoefficient;
        do {
            System.out.println("Enter salary coefficient");
            salaryCoefficient = scanner.nextLine();
        } while (!SalaryCoefficientValidate.validate(salaryCoefficient));
        return salaryCoefficient;
    }

    public static Employee getEmployee() {
        return new Officer(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getWorkDays(), getSalaryCoefficient());
    }
}
