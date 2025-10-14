package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class MajorValidate {
    public static boolean validate(String major) {
        return major.matches("^[a-zA-Z]+$");
    }
}
