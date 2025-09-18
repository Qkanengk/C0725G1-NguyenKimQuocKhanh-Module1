package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.CarService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.ICarService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.CarView;


public class AddCarController {
    static ICarService carManager = new CarService();

    static void showMenu() {
        carManager.add(CarView.inputData());
    }
}
