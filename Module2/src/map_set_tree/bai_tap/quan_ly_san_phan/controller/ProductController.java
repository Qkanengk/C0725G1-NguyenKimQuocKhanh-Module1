package map_set_tree.bai_tap.quan_ly_san_phan.controller;

import map_set_tree.bai_tap.quan_ly_san_phan.entity.Product;
import map_set_tree.bai_tap.quan_ly_san_phan.repository.IProductRepository;
import map_set_tree.bai_tap.quan_ly_san_phan.service.IProductService;
import map_set_tree.bai_tap.quan_ly_san_phan.service.ProductService;
import map_set_tree.bai_tap.quan_ly_san_phan.view.ProductView;

import java.util.Scanner;

public class ProductController {
    private static IProductService productManager = new ProductService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====Product Management=====\n" +
                    "1. Add new product\n" +
                    "2. Edit product by ID\n" +
                    "3. Delete product by ID\n" +
                    "4. Find product by Name\n" +
                    "5. Display sorted list\n" +
                    "6. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("=====Add new product===== ");
                    Product product = ProductView.inputAddData();
                    productManager.add(product);
                    break;
                case 2:
                    System.out.println("=====Edit a product===== ");
                    int id = ProductView.productId();
                    String newName = ProductView.productName();
                    double newPrice = ProductView.price();
                    productManager.edit(id, newName, newPrice);
                    break;
                case 3:
                    System.out.println("=====Delete product=====");
                    int idDel = ProductView.productId();
                    productManager.delete(idDel);
                    break;
                case 4:
                    System.out.println("=====Find product=====");
                    String name = ProductView.productName();
                    System.out.println(productManager.find(name));
                    break;
                case 5:
                    System.out.println("=====Product list=====");
                    System.out.println(productManager.showListPriceDecrease());
                    break;
            }

        } while (choice != 6);
    }
}
