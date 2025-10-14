package bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView;

import bai_tap_them.quan_ly_hoa_don_tien_dien.controller.CustomerController;
import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.CustomerType;
import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.LocalCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.CustomerTypeService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ILocalCustomerService;

import java.util.List;

public class LocalCustomerView extends CustomerView {
    private static CustomerTypeService customerTypeService = new CustomerTypeService();
    private static ILocalCustomerService localCustomerService = CustomerController.getLocalCustomerService();


    public static String getId() {
        System.out.println("Nhập id của khách hàng");
        return scanner.nextLine();
    }

    public static String getType() {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        int choice = 0;
        String type = "";
        do {
            System.out.println("Nhập loại khách hàng\n" +
                    "1. Sinh hoạt\n" +
                    "2. Kinh doanh\n" +
                    "3. Sản xuất");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập chữ số");
                continue;
            }
            switch (choice) {
                case 1:
                    type = customerTypeList.get(0).getType();
                    break;
                case 2:
                    type = customerTypeList.get(1).getType();
                    break;
                case 3:
                    type = customerTypeList.get(2).getType();
                    break;
            }
        } while (choice > 3 || choice < 1);
        return type;
    }

    public static double getConsumption() {
        System.out.println("Nhập định mức tiêu thụ điện của khách hàng");
        return Double.parseDouble(scanner.nextLine());
    }

    public static LocalCustomer getLocalCustomer() {
        return new LocalCustomer(getId(), getName(), getType(), getConsumption());
    }

    public static void addLocalCustomer() {
        if (localCustomerService.add(getLocalCustomer())) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }

    public static void showListLocalCustomer() {
        System.out.println("=====Local Customer=====");
        if (localCustomerService.findAll().isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println(localCustomerService.findAll());
        }
    }


}
