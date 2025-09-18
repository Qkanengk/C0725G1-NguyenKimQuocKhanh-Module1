package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view;

import java.util.Scanner;

public class VehicleView {

    public static String delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== XÓA PHƯƠNG TIỆN THEO BIỂN KIỂM SOÁT =====\n");
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }
    public static String update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== CHỈNH SỬA PHƯƠNG TIỆN THEO BIỂN KIỂM SOÁT =====\n");
        System.out.println("Nhập biển kiểm soát");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }
}
