package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.controller;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.view.MotorCycleView;


public class ShowListMotorCycleController extends AddMotorCycleController{
    public static void showList(){
        System.out.println("DANH SÁCH XE MÁY");
        MotorCycle[] motorCycles = motorCycleManager.findAll();
        MotorCycleView.showList(motorCycles);
    }
}
