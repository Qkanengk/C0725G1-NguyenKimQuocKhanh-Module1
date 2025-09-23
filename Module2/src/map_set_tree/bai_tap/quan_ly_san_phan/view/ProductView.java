package map_set_tree.bai_tap.quan_ly_san_phan.view;

import map_set_tree.bai_tap.quan_ly_san_phan.entity.Product;

import java.util.Scanner;

public class ProductView {
    public static int productId() {
        System.out.println("Input product's ID");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static String productName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input product's name");
        String productName = scanner.nextLine();
        return productName;
    }

    public static double price() {
        System.out.println("Input product's price");
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        return price;
    }

    public static Product inputAddData() {
        Product product = new Product(productId(), productName(), price());
        return product;
    }


}
