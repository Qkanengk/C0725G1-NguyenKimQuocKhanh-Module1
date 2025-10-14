package bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.CustomerType;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.CustomerTypeRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.IRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.IService;

import java.util.List;

public class CustomerTypeService implements IService<CustomerType> {
    private static IRepository customerTypeRepository = new CustomerTypeRepository();


    @Override
    public boolean add(CustomerType customerType) {
        return customerTypeRepository.add(customerType);
    }

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
