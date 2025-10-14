package bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer;

public class LocalCustomer extends Customer {
    private String type;
    private double consumption;

    public LocalCustomer(String id, String name, String type, double consumption) {
        super(id, name);
        this.type = type;
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public String getInfo() {
        return super.getInfo() + "," + type + "," + consumption;
    }

    public String toString() {
        return String.format(
                "%s" +
                        " %-15s : %s\n" +
                        " %-15s : %.2f inch\n" +
                        "-----------------------------\n",
                super.toString(),
                "Loại khách", getType(),
                "Định mức tiêu thụ điện", getConsumption());
    }
}
