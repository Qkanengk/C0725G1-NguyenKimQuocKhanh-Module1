package bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView;

import bai_tap_them.quan_ly_hoa_don_tien_dien.controller.CustomerController;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.IForeignCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ILocalCustomerService;

import java.util.Scanner;

public class CustomerView {
    private static final IForeignCustomerService foreignCustomerService = CustomerController.getForeignCustomerService();
    private static final ILocalCustomerService localCustomerService = CustomerController.getLocalCustomerService();
    static Scanner scanner = new Scanner(System.in);

    public static String getName() {
        System.out.println("Nhập tên của khách hàng");
        return scanner.nextLine();
    }

    public static void showListCustomer() {
        LocalCustomerView.showListLocalCustomer();
        ForeignCustomerView.showListForeignCustomer();
    }

    public static void findByName() {
        String name = getName();
        if (localCustomerService.findByName(name).isEmpty() && foreignCustomerService.findByName(name).isEmpty()) {
            System.out.println("Không tìm thấy khách hàng");
        } else if (localCustomerService.findByName(name).isEmpty()) {
            foreignCustomerService.findByName(name).forEach(System.out::println);
        } else if (foreignCustomerService.findByName(name).isEmpty()) {
            localCustomerService.findByName(name).forEach(System.out::println);
        }
    }
}
