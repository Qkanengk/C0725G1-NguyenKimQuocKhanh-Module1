package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

import java.util.Scanner;

public class UpdateController {
    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("====== CHỈNH SỬA THÔNG TIN PHƯƠNG TIỆN =====\n" +
                    "Vui lòng chọn loại phương tiện\n" +
                    "1. Sửa thông tin xe tải\n" +
                    "2. Sửa thông tin ô tô\n" +
                    "3. Sửa thông tin xe máy\n" +
                    "4. Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    UpdateTruckController.showMenu();
                    break;
                case 2:
                    UpdateCarController.showMenu();
                    break;
                case 3:
                    UpdateMotorCycleController.showMenu();
                    break;
            }

        } while (choice != 4);
    }

}
