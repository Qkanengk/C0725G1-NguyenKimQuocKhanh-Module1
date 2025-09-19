package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.controller;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.ITruckService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service.TruckService;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.view.TruckView;

public class TruckController {
    static ITruckService truckManager = new TruckService();

    static void addMenu() {
        System.out.println("=====THÊM XE TẢI=====");
        truckManager.add(TruckView.inputData());
        System.out.println("====THÊM THÀNH CÔNG=====");
    }

    static void deleteMenu() {
        System.out.println("=====XÓA XE TẢI=====");
        truckManager.delete(TruckView.getLicensePlate());
        System.out.println("====XÓA THÀNH CÔNG=====");
    }

    static void editMenu() {
        System.out.println("=====CHỈNH SỬA THÔNG TIN XE TẢI======");
        truckManager.edit(TruckView.getLicensePlate(), TruckView.inputData());
        System.out.println("=====CHỈNH SỬA THÀNH CÔNG=====");
    }
    static void findMenu(){
        System.out.println("=====TÌM XE TẢI======");
        System.out.println(truckManager.find(TruckView.getLicensePlate()).toString());
    }

    static void showListMenu() {
        System.out.println("=====DANH SÁCH XE TẢI=====");
        truckManager.showList();
    }
}
