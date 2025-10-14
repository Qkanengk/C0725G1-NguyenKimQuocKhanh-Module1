package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class WorkDayValidate {
    public static boolean validate(String workDays) {
        return workDays.matches("^[1-9]$");
    }
}
