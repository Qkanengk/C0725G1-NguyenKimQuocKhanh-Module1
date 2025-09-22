package bai_tap_them.quan_ly_furama.service.CustomerService;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;

public interface ICustomerService {
    void addCustomer(Customer customer);

    void editCustomer(
            String customerCode,
            String customerName,
            String customerDateOfBirth,
            String customerSex,
            String customerIdNumber,
            String customerPhoneNumber,
            String customerEmail,
            String customerAddress,
            String customerType);

    public String displayListCustomer();
}
