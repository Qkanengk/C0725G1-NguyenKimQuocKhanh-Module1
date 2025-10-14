package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class CommissionValidate {
    public static boolean validate(String commission) {
        return commission.matches("^[1-9][0-9]*$");
    }
}
