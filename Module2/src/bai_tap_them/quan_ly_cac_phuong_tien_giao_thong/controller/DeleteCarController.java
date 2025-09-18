package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

public class DeleteCarController extends AddCarController{
    static void delete(String licensePlate){
        carManager.delete(licensePlate);
    }
}
