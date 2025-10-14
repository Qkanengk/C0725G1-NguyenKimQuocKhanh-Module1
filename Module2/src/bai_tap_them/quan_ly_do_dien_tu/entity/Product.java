package bai_tap_them.quan_ly_do_dien_tu.entity;

public abstract class Product {
    String id;
    String product_id;
    String name;

    double price;

    public Product(String id, String product_id, String name, double price) {
        this.id = id;
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return getId() + "," + getProduct_id() + "," + getName() + "," + getPrice();
    }

    @Override
    public String toString() {
        return String.format(
                "-----------------------------\n" +
                        " Product information\n" +
                        "-----------------------------\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s \n" +
                        " %-15s : %.2f VND\n" +
                        "-----------------------------\n",
                "ID", getId(),
                "Product ID", getProduct_id(),
                "Product name", getName(),
                "Price", getPrice());
    }
}
