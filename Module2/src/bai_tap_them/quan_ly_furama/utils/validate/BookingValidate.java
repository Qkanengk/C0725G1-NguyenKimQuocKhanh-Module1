package bai_tap_them.quan_ly_furama.utils.validate;

public class BookingValidate {
    public static boolean validateBookingId(String id) {
        return id.matches("^BK-\\d{4}$");
    }

    public static boolean validateBookingStartDate(String id) {
        return id.matches("^20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
    }

    public static boolean validateBookingEndDate(String id) {
        return id.matches("^20\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
    }
    public static boolean validateServiceId(String id){
        return id.matches("^(SV{2}L|SVRO|SVHO)-[0-9]{4}$");
    }


}
