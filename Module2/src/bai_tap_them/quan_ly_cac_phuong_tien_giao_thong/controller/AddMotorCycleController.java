package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.IMotorCycleService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service.MotorCycleService;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.MotorCycleView;



public class AddMotorCycleController {
    static IMotorCycleService motorCycleManager = new MotorCycleService();

    static void showMenu() {
        motorCycleManager.add(MotorCycleView.inputData());
    }
}
