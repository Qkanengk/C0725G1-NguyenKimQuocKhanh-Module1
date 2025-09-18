package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view;


import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Truck;

import java.util.Scanner;

public class TruckView {
    public static void showList(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] != null) {
                System.out.println("====================" +
                        "\nBiển số: " + trucks[i].getLicensePlate() +
                        "\nHãng sản xuất: " + trucks[i].getManufacturerName() +
                        "\nNăm sản xuất: " + trucks[i].getManufactureYear() +
                        "\nChủ sở hữu: " + trucks[i].getOwner() +
                        "\nTải trọng: " + trucks[i].getLoadCapacity());
            }
        }
    }

    public static Truck inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== THÊM MỚI XE TẢI =====\n");
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập tải trọng");
        double loadCapacity = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(licensePlate, manufactureName, manufactureYear, owner, loadCapacity);
        return truck;
    }

    public static Truck inputUpdateData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== CHỈNH SỬA THÔNG TIN XE TẢI =====\n");
        System.out.println("Nhập biển kiểm soát mới");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất mới");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất mới");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu mới");
        String owner = scanner.nextLine();
        System.out.println("Nhập tải trọng mới");
        double loadCapacity = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(licensePlate, manufactureName, manufactureYear, owner, loadCapacity);
        return truck;
    }
}
