package bai_tap_them.quan_ly_san_pham_CRUD;

import bai_tap_them.quan_ly_sinh_vien.StudentManager;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int choice = 0;
        do {
            System.out.println("===ProductManager===\n" +
                    "1.Show Product\n" +
                    "2.Add Product\n" +
                    "3.Delete Product\n" +
                    "4.Edit Product\n" +
                    "5.Exit\n" +
                    "===Input your choice===");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("===ProductList===");
                    manager.showProduct();
                    break;
                case 2:
                    System.out.println("===Input an product id===");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("===Input a product name===");
                    String name = scanner.nextLine();
                    System.out.println("===Input a price===");
                    double price = Double.parseDouble(scanner.nextLine());
                    manager.addProduct(id,name,price);
                    break;
                case 3:
                    System.out.println("===Input an product id===");
                    int delId = Integer.parseInt(scanner.nextLine());
                    manager.deleteProduct(delId);
                    break;
                case 4:
                    System.out.println("===Input an product id===");
                    int editId = Integer.parseInt(scanner.nextLine());
                    System.out.println("===Input a product name===");
                    String newName = scanner.nextLine();
                    System.out.println("===Input a price===");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    manager.editProduct(editId,newName,newPrice);
                    break;

            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        showMenu();
    }
}
