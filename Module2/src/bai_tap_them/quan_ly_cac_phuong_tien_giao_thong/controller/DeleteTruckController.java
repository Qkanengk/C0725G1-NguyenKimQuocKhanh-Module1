package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

public class DeleteTruckController extends AddTruckController{
    static void delete(String licensePlate){
        truckManager.delete(licensePlate);
    }
}
