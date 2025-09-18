package bai_tap_them.bai_tap_ChatGPT.quan_ly_ngan_hang;

public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + transactionFee);
    }
}
