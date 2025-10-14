package bai_tap_them.quan_ly_do_dien_tu.controller;

import bai_tap_them.quan_ly_do_dien_tu.view.ProductView;

import java.util.Scanner;

public class ProductController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        int choice = 0;
        do {
            System.out.println("=====Product Management=====\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm theo tên\n" +
                    "5. Thoát chương trình");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập chữ số");
                continue;
            }
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showListProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    findProduct();
                    break;
            }
        } while (choice != 5);
    }

    public static void addProduct() {
        int choice = 0;
        do {
            System.out.println("=====Product Management=====\n" +
                    "1. Thêm điện thoại\n" +
                    "2. Thêm máy tính\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập chữ số");
                continue;
            }
            switch (choice) {
                case 1:
                    PhoneController.addPhone();
                    break;
                case 2:
                    ComputerController.addComputer();
                    break;

            }
        } while (choice >= 3);
    }

    public static void showListProduct() {
        ProductView.showListProduct();
    }

    public static void removeProduct() {
        ProductView.removeProduct();
    }

    public static void findProduct() {
        ProductView.findProduct();
    }

}
