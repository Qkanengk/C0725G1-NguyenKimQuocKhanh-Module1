package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;

import java.util.Scanner;

public class VehicleController {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("====== CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG =====\n" +
                    "Vui lòng chọn chức năng\n" +
                    "1. Thêm phương tiện mới\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Sửa thông tin phương tiện\n" +
                    "5. Thoát chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddController.showMenu();
                    break;
                case 2:
                    ShowListController.showMenu();
                    break;
                case 3:
                    DeleteController.showMenu();
                    break;
                case 4:
                    UpdateController.showMenu();
                    break;
            }

        } while (choice != 5);
    }
}
