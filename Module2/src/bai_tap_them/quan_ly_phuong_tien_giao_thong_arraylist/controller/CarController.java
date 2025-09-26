package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.controller;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.CarService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.ICarService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.view.CarView;

public class CarController {
    static ICarService carManager = new CarService();

    static void addMenu() {
        System.out.println("=====THÊM XE Ô TÔ=====");
        carManager.add(CarView.inputData());
        System.out.println("====THÊM THÀNH CÔNG=====");
    }

    static void deleteMenu() {
        System.out.println("=====XÓA XE Ô TÔ=====");
        carManager.delete(CarView.getLicensePlate());
        System.out.println("====XÓA THÀNH CÔNG=====");
    }

    static void editMenu() {
        System.out.println("=====CHỈNH SỬA THÔNG TIN XE Ô TÔ======");
        carManager.edit(CarView.getLicensePlate(), CarView.inputData());
        System.out.println("=====CHỈNH SỬA THÀNH CÔNG=====");
    }

    static void findMenu() {
        System.out.println("=====TÌM XE Ô TÔ======");
        System.out.println(carManager.find(CarView.getLicensePlate()).toString());
    }

    static void showListMenu() {
        System.out.println("=====DANH SÁCH XE Ô TÔ=====");
        CarView.showList(carManager.getList());
    }
}
