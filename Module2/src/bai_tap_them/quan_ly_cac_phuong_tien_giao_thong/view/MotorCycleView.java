package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view;


import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;

import java.util.Scanner;

public class MotorCycleView {
    public static void showList(MotorCycle[] motorCycles) {
        for (int i = 0; i < motorCycles.length; i++) {
            if (motorCycles[i] != null) {
                System.out.println("====================" +
                        "\nBiển số: " + motorCycles[i].getLicensePlate() +
                        "\nHãng sản xuất: " + motorCycles[i].getManufacturerName() +
                        "\nNăm sản xuất: " + motorCycles[i].getManufactureYear() +
                        "\nChủ sở hữu: " + motorCycles[i].getOwner() +
                        "\nCông suất: " + motorCycles[i].getEnginePower());
            }
        }
    }

    public static MotorCycle inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== THÊM MỚI XE MÔ TÔ =====\n");
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập công suất");
        double enginePower = Double.parseDouble(scanner.nextLine());
        MotorCycle motorCycle  = new MotorCycle(licensePlate,manufactureName,manufactureYear,owner,enginePower);
        return motorCycle;
    }

    public static MotorCycle inputUpdateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== CHỈNH SỬA THÔNG TIN XE MÔ TÔ =====\n");
        System.out.println("Nhập biển kiểm soát mới");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất mới");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất mới");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu mới");
        String owner = scanner.nextLine();
        System.out.println("Nhập công suất mới");
        double enginePower = Double.parseDouble(scanner.nextLine());
        MotorCycle motorCycle  = new MotorCycle(licensePlate,manufactureName,manufactureYear,owner,enginePower);
        return motorCycle;
    }


}
