package bai_tap_them.quan_ly_nhan_su_cong_ty.utils.validate;

public class PhoneNumberValidate {
    public static boolean validate(String phoneNumber){
        return phoneNumber.matches("^0[35789]\\d{8}$");
    }
}
