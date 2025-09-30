package ss19_String_regex.bai_tap.phone_number_validate;

public class PhoneNumberValidate {
    public static boolean phoneNumberValidate(String phoneNumber){
        return phoneNumber.matches("^\\(\\d\\d\\)-\\(0\\d{9}\\)$");
    }
}
