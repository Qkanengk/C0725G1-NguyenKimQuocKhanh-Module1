package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;


import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.TruckView;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

public class UpdateTruckController extends AddTruckController {
    static void showMenu() {
        truckManager.update(VehicleView.update(), TruckView.inputUpdateData());
    }
}
