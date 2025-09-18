package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.CarView;

public class ShowListCarController extends AddCarController {
    public static void showList() {
        System.out.println("DANH SÁCH Ô TÔ");
        Car[] cars = carManager.findAll();
        CarView.showList(cars);

    }
}
