package bai_tap_them.quan_ly_furama.service.CustomerService;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.repository.CustomerRepository.CustomerRepository;
import bai_tap_them.quan_ly_furama.repository.CustomerRepository.ICustomerRepository;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer(
            String customerCode,
            String customerName,
            String customerDateOfBirth,
            String customerSex,
            String customerIdNumber,
            String customerPhoneNumber,
            String customerEmail,
            String customerAddress,
            String customerType) {
        customerRepository.editCustomer(
                customerCode,
                customerName,
                customerDateOfBirth,
                customerSex,
                customerIdNumber,
                customerPhoneNumber,
                customerEmail,
                customerAddress,
                customerType);
    }

    @Override
    public String displayListCustomer() {
        return displayListCustomer();
    }
}
