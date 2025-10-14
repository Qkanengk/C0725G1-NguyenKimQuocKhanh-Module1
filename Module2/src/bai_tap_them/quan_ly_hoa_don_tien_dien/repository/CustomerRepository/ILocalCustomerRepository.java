package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.LocalCustomer;

public interface ILocalCustomerRepository extends ICustomerRepository<LocalCustomer> {
    LocalCustomer findById(String id);
}
