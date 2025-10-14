package bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer;

public class CustomerType {
    private String id;
    private String type;

    public CustomerType(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return getId() + "," + getType();
    }
}
