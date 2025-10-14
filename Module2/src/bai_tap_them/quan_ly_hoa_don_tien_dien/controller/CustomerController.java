package bai_tap_them.quan_ly_hoa_don_tien_dien.controller;

import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ForeignCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.IForeignCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ILocalCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.LocalCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView.CustomerView;
import bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView.ForeignCustomerView;
import bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView.LocalCustomerView;

public class CustomerController {
    private static ILocalCustomerService localCustomerService = new LocalCustomerService();
    private static IForeignCustomerService foreignCustomerService = new ForeignCustomerService();

    public static ILocalCustomerService getLocalCustomerService() {
        return localCustomerService;
    }

    public static IForeignCustomerService getForeignCustomerService() {
        return foreignCustomerService;
    }

    public static void addLocalCustomer() {
        LocalCustomerView.addLocalCustomer();
    }

    public static void addForeignCustomer() {
        ForeignCustomerView.addForeignCustomer();
    }

    public static void showListCustomer() {
        LocalCustomerView.showListLocalCustomer();
        ForeignCustomerView.showListForeignCustomer();
    }

    public static void findByName() {
        CustomerView.findByName();
    }
}
