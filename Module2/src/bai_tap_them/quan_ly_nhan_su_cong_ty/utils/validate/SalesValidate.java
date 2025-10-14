package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class SalesValidate {
    public static boolean validate(String sales) {
        return sales.matches("^[1-9][0-9]*$");
    }
}
