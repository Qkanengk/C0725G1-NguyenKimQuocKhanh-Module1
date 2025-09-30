package ss19_String_regex.thuc_hanh.validate_email;

public class Main {

    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {

        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.validateEmail(email);
            System.out.println("Email: " + email + " is valid: " + isValid);
        }

        for (String email: invalidEmail){
            boolean isValid = emailExample.validateEmail(email);
            System.out.println("Email: "+email+" is valid: "+isValid);
        }

    }
}
