package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class NameValidate {
    public static boolean validate(String name) {
        return name.matches("^[A-Z][a-z]*(\s[A-Z][a-z]*)+$");
    }

}
