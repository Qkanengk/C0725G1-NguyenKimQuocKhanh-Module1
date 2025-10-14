package bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.services.IService;

import java.util.List;

public interface ICustomerService<T> extends IService<T> {
    List<T> findByName(String name);
}
