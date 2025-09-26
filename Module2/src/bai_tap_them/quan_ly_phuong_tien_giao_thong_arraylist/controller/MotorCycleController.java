package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.controller;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.IMotorCycleService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.MotorCycleService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.view.MotorCycleView;

public class MotorCycleController {
    static IMotorCycleService motorCycleManager = new MotorCycleService();

    static void addMenu() {
        System.out.println("=====THÊM XE TẢI=====");
        motorCycleManager.add(MotorCycleView.inputData());
        System.out.println("====THÊM THÀNH CÔNG=====");
    }

    static void deleteMenu() {
        System.out.println("=====XÓA XE MÔ TÔ=====");
        motorCycleManager.delete(MotorCycleView.getLicensePlate());
        System.out.println("====XÓA THÀNH CÔNG=====");
    }

    static void editMenu() {
        System.out.println("=====CHỈNH SỬA THÔNG TIN XE MÔ TÔ======");
        motorCycleManager.edit(MotorCycleView.getLicensePlate(), MotorCycleView.inputData());
        System.out.println("=====CHỈNH SỬA THÀNH CÔNG=====");
    }

    static void findMenu() {
        System.out.println("=====TÌM XE MÔ TÔ======");
        System.out.println(motorCycleManager.find(MotorCycleView.getLicensePlate()).toString());
    }

    static void showListMenu() {
        System.out.println("=====DANH SÁCH XE MÔ TÔ=====");
        MotorCycleView.showList(motorCycleManager.getList());
    }
}
