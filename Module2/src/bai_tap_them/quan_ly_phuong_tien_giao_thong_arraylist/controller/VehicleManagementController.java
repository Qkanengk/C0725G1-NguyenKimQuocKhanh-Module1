package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.controller;

import java.util.Scanner;

public class VehicleManagementController {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG=====\n" +
                    "1. Thêm phương tiện\n" +
                    "2. Xóa phương tiện\n" +
                    "3. Sửa thông tin phương tiện\n" +
                    "4. Hiển thị danh sách\n" +
                    "5. Tìm phương tiện\n" +
                    "6. Thoát chương trình\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    editMenu();
                case 4:
                    showListMenu();
                    break;
                case 5:
                    findMenu();
                    break;
            }
        } while (choice != 6);
    }

    static void addMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====THÊM MỚI PHƯƠNG TIỆN=====\n" +
                    "1. Thêm xe ô tô\n" +
                    "2. Thêm xe mô tô\n" +
                    "3. Thêm xe tải\n" +
                    "4. Quay lại menu chính\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.addMenu();
                    break;
                case 2:
                    MotorCycleController.addMenu();
                    break;
                case 3:
                    TruckController.addMenu();
                    break;
            }
        } while (choice != 4);
    }

    static void deleteMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====XÓA PHƯƠNG TIỆN=====\n" +
                    "1. Xóa xe ô tô\n" +
                    "2. Xóa xe mô tô\n" +
                    "3. Xóa xe tải\n" +
                    "4. Quay lại menu chính\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.deleteMenu();
                    break;
                case 2:
                    MotorCycleController.deleteMenu();
                    break;
                case 3:
                    TruckController.deleteMenu();
                    break;
            }
        } while (choice != 4);
    }

    static void editMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====CHỈNH SỬA THÔNG TIN PHƯƠNG TIỆN=====\n" +
                    "1. Sửa thông tin xe ô tô\n" +
                    "2. Sửa thông tin xe mô tô\n" +
                    "3. Sửa thông tin xe tải\n" +
                    "4. Quay lại menu chính\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.editMenu();
                    break;
                case 2:
                    MotorCycleController.editMenu();
                    break;
                case 3:
                    TruckController.editMenu();
                    break;

            }
        } while (choice != 4);
    }

    static void showListMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====HIỂN THỊ DANH SÁCH PHƯƠNG TIỆN=====\n" +
                    "1. Danh sách xe ô tô\n" +
                    "2. Danh sách xe mô tô\n" +
                    "3. Danh sách xe tải\n" +
                    "4. Quay lại menu chính\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.showListMenu();
                    break;
                case 2:
                    MotorCycleController.showListMenu();
                    break;
                case 3:
                    TruckController.showListMenu();
                    break;
            }
        } while (choice != 4);
    }

    static void findMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====TÌM PHƯƠNG TIỆN PHƯƠNG TIỆN=====\n" +
                    "1. Tìm xe ô tô\n" +
                    "2. Tìm xe mô tô\n" +
                    "3. Tìm xe tải\n" +
                    "4. Quay lại menu chính\n" +
                    "=====NHẬP LỰA CHỌN CỦA BẠN=====");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CarController.findMenu();
                    break;
                case 2:
                    MotorCycleController.findMenu();
                    break;
                case 3:
                    TruckController.findMenu();
                    break;
            }
        } while (choice != 4);
    }

}
