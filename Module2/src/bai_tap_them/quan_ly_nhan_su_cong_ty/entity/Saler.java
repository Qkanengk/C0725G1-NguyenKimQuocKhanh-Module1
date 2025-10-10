package bai_tap_them.quan_ly_nhan_su_cong_ty.entity;

public class Saler extends Employee {
    private String sales;
    private String commission;

    public Saler(String id, String name, String dateOfBirth, String phoneNumber, String sales, String commission) {
        super(id, name, dateOfBirth, phoneNumber);
        this.sales = sales;
        this.commission = commission;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getInfo() {
        return super.getInfo() + "," + sales + "," + commission;
    }

    @Override
    public String toString() {
        return super.toString() + "Saler{" +
                "sales='" + sales + '\'' +
                ", commission='" + commission + '\'' +
                '}';
    }
}
