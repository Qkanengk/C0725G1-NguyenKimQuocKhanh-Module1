package bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.LocalCustomer;

public interface ILocalCustomerService extends ICustomerService<LocalCustomer>{
    LocalCustomer findById(String id);
}
