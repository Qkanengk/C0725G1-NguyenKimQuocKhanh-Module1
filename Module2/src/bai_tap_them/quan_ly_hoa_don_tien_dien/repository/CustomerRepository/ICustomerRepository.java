package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;

import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.IRepository;

import java.util.List;

public interface ICustomerRepository<T> extends IRepository<T> {
    List<T> findByName(String name);
}
