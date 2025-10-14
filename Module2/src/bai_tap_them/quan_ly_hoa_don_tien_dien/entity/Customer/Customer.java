package bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer;

public abstract class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        return id + "," + name;
    }

    @Override
    public String toString() {
        return String.format(
                "-----------------------------\n" +
                        " Thông tin khách hàng\n" +
                        "-----------------------------\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        "-----------------------------\n",
                "Mã khách hàng", getId(),
                "Tên khách hàng", getName());
    }
}
