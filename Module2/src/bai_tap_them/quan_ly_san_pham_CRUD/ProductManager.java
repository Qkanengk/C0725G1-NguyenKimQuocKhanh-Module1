package bai_tap_them.quan_ly_san_pham_CRUD;

public class ProductManager {
    public static Product[] products = new Product[100];

    static {
        products[0] = new Product(1, "Ipad", 10000);
        products[1] = new Product(2, "Iphone", 15000);
    }

    public void editProduct(int id, String name, double price) {
        if (isExist(id)) {
            for (int i = 0; i < products.length; i++) {
                if (products[i].getId() == id) {
                    products[i] = new Product(id, name, price);
                    System.out.println("Edit success!");
                    break;
                }
            }
        } else System.out.println("This id isn't in the list!");
    }

    public void showProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println("| ProductID: " + products[i].getId() + " | Product Name: " + products[i].getName() + " | Price: " + products[i].getPrice() + "VND");
            }
        }
    }

    public void deleteProduct(int id) {
        if (isExist(id)) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null && products[i].getId() == id) {
                    products[i] = null;
                    System.out.println("Delete success!");
                    break;
                }
            }
        } else System.out.println("This id isn't in the list");

    }

    public void addProduct(int id, String name, double price) {
        if (!isExist(id)) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = new Product(id, name, price);
                    System.out.println("Add success!");
                    break;
                }
            }
        } else System.out.println("This id is exists");
    }

    public boolean isExist(int id) {
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == id) {
                check = true;
                break;
            }
        }
        if (check) {
            return true;
        } else return false;
    }


}
