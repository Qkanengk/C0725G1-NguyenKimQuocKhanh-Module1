package bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.ForeignCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.ForeignCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.IForeignCustomerRepository;

import java.util.List;

public class ForeignCustomerService implements IForeignCustomerService {
    private static IForeignCustomerRepository foreignCustomerRepository = new ForeignCustomerRepository();

    public static IForeignCustomerRepository getForeignCustomerRepository() {
        return foreignCustomerRepository;
    }

    @Override
    public List<ForeignCustomer> findByName(String name) {
        return foreignCustomerRepository.findByName(name);
    }

    @Override
    public boolean add(ForeignCustomer foreignCustomer) {
        return foreignCustomerRepository.add(foreignCustomer);
    }

    @Override
    public List<ForeignCustomer> findAll() {
        return foreignCustomerRepository.findAll();
    }

    @Override
    public ForeignCustomer findById(String id) {
        return foreignCustomerRepository.findById(id);
    }
}
