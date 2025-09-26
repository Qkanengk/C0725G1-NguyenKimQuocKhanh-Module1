package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.view;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;

import java.util.List;
import java.util.Scanner;

public class MotorCycleView {
    public static MotorCycle inputData() {
        Scanner scanner = new Scanner(System.in);
        String licensePlate = getLicensePlate();
        System.out.println("Nhập hãng sản xuất");
        String manufactureName = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int manufactureYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String owner = scanner.nextLine();
        System.out.println("Nhập công suất");
        int enginePower = Integer.parseInt(scanner.nextLine());
        MotorCycle motorCycle = new MotorCycle(licensePlate, manufactureName, manufactureYear, owner, enginePower);
        return motorCycle;
    }

    public static String getLicensePlate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }

    public static void showList(List<MotorCycle> motorCycleList) {
        if (motorCycleList.size() == 0) {
            System.out.println("=====Danh sách rỗng=====");
        } else for (MotorCycle motorCycle : motorCycleList) {
            System.out.println(motorCycle);
        }
    }
}
