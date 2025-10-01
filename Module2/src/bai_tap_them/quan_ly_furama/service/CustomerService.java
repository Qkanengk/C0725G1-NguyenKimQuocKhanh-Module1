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
    public boolean add(Customer customer) {
        return customerRepository.add(customer);
    }

    @Override
    public void update(String id, Customer customer) {
        customerRepository.update(id, customer);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Customer findById(String id) {
        return null;
    }
}
