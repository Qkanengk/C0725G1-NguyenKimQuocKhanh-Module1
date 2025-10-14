package bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView;

import bai_tap_them.quan_ly_hoa_don_tien_dien.controller.CustomerController;
import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.ForeignCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.IForeignCustomerService;


public class ForeignCustomerView extends CustomerView {
    private static final IForeignCustomerService foreignCustomerService = CustomerController.getForeignCustomerService();

    public static String getId() {
        System.out.println("Nhập id của khách hàng");
        return scanner.nextLine();
    }

    public static String getNationality() {
        System.out.println("Nhập quốc t của khách hàng");
        return scanner.nextLine();
    }

    public static ForeignCustomer getForeignCustomer() {
        return new ForeignCustomer(getId(), getName(), getNationality());
    }

    public static void addForeignCustomer() {
        if (foreignCustomerService.add(getForeignCustomer())) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }

    public static void showListForeignCustomer() {
        System.out.println("=====Foreign Customer=====");
        if (foreignCustomerService.findAll().isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println(foreignCustomerService.findAll());
        }
    }

}
