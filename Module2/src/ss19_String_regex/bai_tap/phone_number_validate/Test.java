package ss19_String_regex.bai_tap.phone_number_validate;

import ss19_String_regex.bai_tap.class_validate.Validate;

public class Test {
    private static final String[] validPhoneNumber = {"(84)-(0978489648)"};
    private static final String[] inValidPhoneNumber = {"(a8)-(22222222)", "(84)-(22b22222)"};

    public static void main(String[] args) {

        for (String phoneNumber: validPhoneNumber){
            System.out.println(phoneNumber+" is valid: "+ PhoneNumberValidate.phoneNumberValidate(phoneNumber));
        }

        for (String phoneNumber: inValidPhoneNumber){
            System.out.println(phoneNumber+" is valid: "+ PhoneNumberValidate.phoneNumberValidate(phoneNumber));
        }
    }
}
