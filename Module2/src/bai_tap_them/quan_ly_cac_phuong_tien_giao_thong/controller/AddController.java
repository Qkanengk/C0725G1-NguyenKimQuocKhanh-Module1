package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import java.util.Scanner;

public class AddController {
    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("====== THÊM MỚI PHƯƠNG TIỆN =====\n" +
                    "Vui lòng chọn loại phương tiện\n" +
                    "1. Thêm xe tải\n" +
                    "2. Thêm ô tô\n" +
                    "3. Thêm xe máy\n" +
                    "4. Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddTruckController.showMenu();
                    break;
                case 2:
                    AddCarController.showMenu();
                    break;
                case 3:
                    AddMotorCycleController.showMenu();
                    break;
            }

        } while (choice != 4);
    }
}
