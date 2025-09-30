package ss19_String_regex.thuc_hanh.validate_account;

public class Main {

    private static AccountExample accountExample;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account: validAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: "+account+" is valid: "+isValid);
        }
        for (String account: invalidAccount){
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: "+account+" is valid: "+isValid);
        }
    }
}
