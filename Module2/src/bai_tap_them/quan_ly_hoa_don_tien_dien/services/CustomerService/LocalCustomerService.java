package bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.LocalCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.ILocalCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.LocalCustomerRepository;

import java.util.List;

public class LocalCustomerService implements ILocalCustomerService {
    private static ILocalCustomerRepository localCustomerRepository = new LocalCustomerRepository();

    public static ILocalCustomerRepository getLocalCustomerRepository() {
        return localCustomerRepository;
    }

    @Override
    public boolean add(LocalCustomer localCustomer) {
        return localCustomerRepository.add(localCustomer);
    }

    @Override
    public List<LocalCustomer> findAll() {
        return localCustomerRepository.findAll();
    }

    @Override
    public List<LocalCustomer> findByName(String name) {
        return localCustomerRepository.findByName(name);
    }

    @Override
    public LocalCustomer findById(String id) {
        return localCustomerRepository.findById(id);
    }
}
