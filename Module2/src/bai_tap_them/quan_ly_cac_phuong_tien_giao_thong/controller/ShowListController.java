package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import java.util.Scanner;

public class ShowListController extends AddController {
    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("====== HIỂN THỊ DANH SÁCH PHƯƠNG TIỆN =====\n" +
                    "Vui lòng chọn loại phương tiện\n" +
                    "1. Hiển thị danh sách xe tải\n" +
                    "2. Hiển thị danh sách ô tô\n" +
                    "3. Hiển thị danh sách xe máy\n" +
                    "4. Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ShowListTruckController.showList();
                    break;
                case 2:
                    ShowListCarController.showList();
                    break;
                case 3:
                    ShowListMotorCycleController.showList();
                    break;
            }

        } while (choice != 4);
    }
}
