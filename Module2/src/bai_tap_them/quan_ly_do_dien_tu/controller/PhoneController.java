package bai_tap_them.quan_ly_do_dien_tu.controller;

import bai_tap_them.quan_ly_do_dien_tu.service.IPhoneService;
import bai_tap_them.quan_ly_do_dien_tu.service.PhoneService;
import bai_tap_them.quan_ly_do_dien_tu.view.PhoneView;

import java.util.Scanner;

public class PhoneController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IPhoneService phoneService = new PhoneService();

    public static IPhoneService getPhoneService() {
        return phoneService;
    }
    public static void addPhone() {
        PhoneView.addPhone();
    }
}
