package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class LevelValidate {
    public static boolean validate(String level) {
        return level.matches("^[A-Z][A-z]*(\\s[A-z][a-z]*)*$");
    }
}
