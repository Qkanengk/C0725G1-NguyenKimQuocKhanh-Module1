package bai_tap_them.bai_tap_ChatGPT.quan_ly_ngan_hang;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount("01212",1000000,2000);
        account.withdraw(10000);
        System.out.println(account.getBalance());
    }
}
