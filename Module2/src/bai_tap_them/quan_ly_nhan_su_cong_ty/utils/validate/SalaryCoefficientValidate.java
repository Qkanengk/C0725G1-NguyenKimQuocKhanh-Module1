package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class SalaryCoefficientValidate {
    public static boolean validate(String salaryCoefficient) {
        return salaryCoefficient.matches("^[1-9]+$");
    }
}
