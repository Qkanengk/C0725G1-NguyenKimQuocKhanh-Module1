package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;


import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.ITruckService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.TruckService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.TruckView;


public class AddTruckController {
    static ITruckService truckManager = new TruckService();

    static void showMenu() {
        truckManager.add(TruckView.inputData());
    }
}
