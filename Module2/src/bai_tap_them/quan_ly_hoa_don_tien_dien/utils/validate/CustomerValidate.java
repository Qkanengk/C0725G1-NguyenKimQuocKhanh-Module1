package bai_tap_them.quan_ly_hoa_don_tien_dien.utils.validate;

public class CustomerValidate {
    public static boolean validateLocalId(String id) {
        return id.matches("^KHVN-[0-9]{4}[1-9]$");
    }
    public static boolean validateForeignId(String id) {
        return id.matches("^KHNN-[0-9]{4}[1-9]$");
    }
    public static boolean validateName(String name) {
        return name.matches("^([A-ZÀ-Ỵ][a-zà-ỹ]+)(\\s[A-ZÀ-Ỵ][a-zà-ỹ]+)+$");
    }


}
