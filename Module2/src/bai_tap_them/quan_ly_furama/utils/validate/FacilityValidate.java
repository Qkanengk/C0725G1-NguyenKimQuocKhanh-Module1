package bai_tap_them.quan_ly_furama.utils.validate;

public class FacilityValidate {
    public static boolean validateRoomId(String id){
        return id.matches("^SVRO-[0-9]{4}$");
    }
    public static boolean validateHouseId(String id){
        return id.matches("^SVHO*-[0-9]{4}$");
    }
    public static boolean validateVilaId(String id){
        return id.matches("^SV{2}L*-[0-9]{4}$");
    }

    public static  boolean validateFacilityName(String name){
        return name.matches("^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$");
    }
}
