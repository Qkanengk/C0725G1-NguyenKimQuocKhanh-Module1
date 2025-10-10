package bai_tap_them.quan_ly_furama.entity.Person;

public class Voucher {
    private int amount;
    private String voucherType;

    public Voucher(int amount, String voucherType) {
        this.amount = amount;
        this.voucherType = voucherType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }
}
