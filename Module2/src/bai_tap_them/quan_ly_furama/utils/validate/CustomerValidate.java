package bai_tap_them.quan_ly_furama.utils.validate;

public class CustomerValidate {
    public static boolean validateId(String id){
        return id.matches("^KH-[0-9]{4}$");
    }
    public static  boolean validateName(String name){
        return name.matches("^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$");
    }

    public static boolean validateIdentityNumber(String identityNumber){
        return identityNumber.matches("^[0-9]{9}|[0-9]{12}$");
    }

    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("^0[0-9]{9}$");
    }

    public static boolean validateEmail(String email){
        return email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
    }

    public static boolean validateDateOfBirth(String dateOfBirth){
        return dateOfBirth.matches("^(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");
    }
}
