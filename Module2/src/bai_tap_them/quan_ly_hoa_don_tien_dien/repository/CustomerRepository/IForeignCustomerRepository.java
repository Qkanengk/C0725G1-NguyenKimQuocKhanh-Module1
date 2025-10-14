package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.ForeignCustomer;

public interface IForeignCustomerRepository extends ICustomerRepository<ForeignCustomer>{
    ForeignCustomer findById(String id);
}
