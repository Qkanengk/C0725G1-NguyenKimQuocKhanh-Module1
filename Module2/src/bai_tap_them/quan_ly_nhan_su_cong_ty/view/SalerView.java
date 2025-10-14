package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Saler;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate.CommissionValidate;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate.SalesValidate;

import java.util.Scanner;

public class SalerView extends EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getSales() {
        String sales;
        do {
            System.out.println("Enter sales");
            sales = scanner.nextLine();
        } while (!SalesValidate.validate(sales));
        return sales;
    }

    public static String getCommission() {
        String commission;
        do {
            System.out.println("Enter commission");
            commission = scanner.nextLine();
        } while (!CommissionValidate.validate(commission));
        return commission;
    }

    public static Employee getEmployee() {
        return new Saler(getId(), getName(), getDateOfBirth(), getPhoneNumber(), getSales(), getCommission());
    }
}
