package bai_tap_them.quan_ly_nhan_su_cong_ty.controller;

import bai_tap_them.quan_ly_nhan_su_cong_ty.service.EngineerService;
import bai_tap_them.quan_ly_nhan_su_cong_ty.service.IEngineerService;
public class MainMenu {
    public static void main(String[] args) {
        IEngineerService iEngineerService = new EngineerService();

        System.out.println(iEngineerService.findByName("khAnh"));
    }

}
