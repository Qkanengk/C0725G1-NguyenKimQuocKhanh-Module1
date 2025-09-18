package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;

import java.util.Scanner;

public class CarView {

    public static void showList(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println("====================" +
                        "\nBiển số: " + cars[i].getLicensePlate() +
                        "\nHãng sản xuất: " + cars[i].getManufacturerName() +
                        "\nNăm sản xuất: " + cars[i].getManufactureYear() +
                        "\nChủ sở hữu: " + cars[i].getOwner() +
                        "\nSố chỗ ngồi: " + cars[i].getNumberOfSits() +
                        "\nKiểu: " + cars[i].getTypeOfCar());
            }
        }
    }

    public static Car inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== THÊM MỚI Ô TÔ =====\n");
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập kiểu xe");
        String typeOfCar = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int numberOfSits = Integer.parseInt(scanner.nextLine());
        Car car = new Car(licensePlate, manufactureName, manufactureYear, owner, numberOfSits, typeOfCar);
        return car;
    }

    public static Car inputDataUPdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== CHỈNH SỬA THÔNG TIN Ô TÔ =====\n");
        System.out.println("Nhập biển kiểm soát mới");
        String licensePlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất mới");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất mới");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu mới");
        String owner = scanner.nextLine();
        System.out.println("Nhập kiểu xe mới");
        String typeOfCar = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi mới");
        int numberOfSits = Integer.parseInt(scanner.nextLine());
        Car car = new Car(licensePlate, manufactureName, manufactureYear, owner, numberOfSits, typeOfCar);
        return car;
    }



}
