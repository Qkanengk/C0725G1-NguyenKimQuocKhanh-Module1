package bai_tap_them.quan_ly_do_dien_tu.view;

import bai_tap_them.quan_ly_do_dien_tu.controller.PhoneController;
import bai_tap_them.quan_ly_do_dien_tu.entity.Phone;

import java.util.Scanner;

public class PhoneView extends ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Double getBatteryCapacity() {
        System.out.println("Nhập dung lượng pin của điện thoại");
        return Double.parseDouble(scanner.nextLine());
    }

    public static Double getSreenSize() {
        System.out.println("Nhập kích thước màn hình điện thoại");
        return Double.parseDouble(scanner.nextLine());
    }

    public static Phone getPhone() {
        return new Phone(getId(), getProductId(), getName(), getPrice(), getBatteryCapacity(), getSreenSize());
    }

    public static void addPhone() {
        if (PhoneController.getPhoneService().add(getPhone())) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }


    public static void showListPhone() {
        System.out.println("=====Phone=====");
        if (PhoneController.getPhoneService().findAll().isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else
            System.out.println(PhoneController.getPhoneService().findAll());
    }
}
