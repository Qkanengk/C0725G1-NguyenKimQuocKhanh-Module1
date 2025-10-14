package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class DateOfBirthValidate {
    public static boolean validate(String dateOfBirth) {
        return dateOfBirth.matches("(([0|1|2]\\d{1})|(3[0|1]{1}))-\\d{2}-2\\d{3}");
    }
}
