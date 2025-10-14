package bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer;

public class ForeignCustomer extends Customer {
    private String nationality;

    public ForeignCustomer(String id, String name, String nationality) {
        super(id, name);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getInfo() {
        return super.getInfo() + "," + getNationality();
    }

    @Override
    public String toString() {
        return String.format("%s" +
                        " %-15s : %s\n" +
                        "-----------------------------\n",
                super.toString(),
                "Quốc tịch", getNationality());
    }
}
