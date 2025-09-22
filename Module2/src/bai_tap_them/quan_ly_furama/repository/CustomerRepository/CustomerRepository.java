package bai_tap_them.quan_ly_furama.repository.CustomerRepository;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
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

        for (Customer customer : customerList) {
            if (customer.getCode().equals(customerCode)) {
                customer.setName(customerName);
                customer.setDateOfBirth(customerDateOfBirth);
                customer.setSex(customerSex);
                customer.setIdNumber(customerIdNumber);
                customer.setPhoneNumber(customerPhoneNumber);
                customer.setEmail(customerEmail);
                customer.setCustomerAddress(customerAddress);
                customer.setCustomerType(customerType);

            }
        }
    }

    @Override
    public String displayListCustomer() {
        String list = "";
        for (Customer customer : customerList) {
            list += "\n=====================\n" + customer.toString();
        }
        return list;
    }
}
