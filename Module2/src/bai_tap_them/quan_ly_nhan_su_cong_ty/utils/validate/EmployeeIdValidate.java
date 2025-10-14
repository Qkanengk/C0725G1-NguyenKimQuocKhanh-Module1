package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class EmployeeIdValidate {
    public static boolean validate(String id) {
        return id.matches("^NV-[0-9]{4}$");
    }
}
