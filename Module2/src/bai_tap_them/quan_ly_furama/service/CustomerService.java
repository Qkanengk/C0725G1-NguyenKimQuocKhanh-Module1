package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.repository.CustomerRepository;
import bai_tap_them.quan_ly_furama.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Object o) {
        customerRepository.add(o);
    }

    @Override
    public void update(String id, Object o) {
        customerRepository.update(id, o);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Object findById(String id) {
        return null;
    }
}
