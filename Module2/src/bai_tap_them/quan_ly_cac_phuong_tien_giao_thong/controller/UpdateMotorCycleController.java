package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.MotorCycleView;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.VehicleView;

public class UpdateMotorCycleController extends AddMotorCycleController {
    static void showMenu() {
        motorCycleManager.update(VehicleView.update(), MotorCycleView.inputUpdateData());
    }
}
