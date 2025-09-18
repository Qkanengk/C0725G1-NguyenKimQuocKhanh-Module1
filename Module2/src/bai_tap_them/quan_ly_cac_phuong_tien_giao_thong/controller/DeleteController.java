package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

import java.util.Scanner;

public class DeleteController {
    static void showMenu() {
        String licensePlate = VehicleView.delete();
        DeleteCarController.delete(licensePlate);
        DeleteTruckController.delete(licensePlate);
        DeleteMotorCycleController.delete(licensePlate);
    }
}
