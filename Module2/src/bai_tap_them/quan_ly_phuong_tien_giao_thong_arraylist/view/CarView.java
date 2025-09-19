package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.view;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;

import java.util.Scanner;

public class CarView {
    public static Car inputData() {
        Scanner scanner = new Scanner(System.in);
        String licensePlate = getLicensePlate();
        System.out.println("Nhập hãng sản xuất");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int numberOfSits = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String typeOfCar = scanner.nextLine();
        Car car = new Car(licensePlate, manufactureName, manufactureYear, owner, numberOfSits, typeOfCar);
        return car;
    }

    public static String getLicensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }
}
