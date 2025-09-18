package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Truck;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.TruckView;

public class ShowListTruckController extends AddTruckController {
    public static void showList(){
        System.out.println("DANH SÁCH XE TẢI");
        Truck[] trucks = truckManager.findAll();
        TruckView.showList(trucks);
    }
}
