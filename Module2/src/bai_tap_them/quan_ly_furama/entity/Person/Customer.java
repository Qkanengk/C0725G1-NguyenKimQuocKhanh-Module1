package bai_tap_them.quan_ly_furama.entity.Person;

import bai_tap_them.quan_ly_furama.service.CustomerService;

import java.time.LocalDate;

public class Customer extends Person implements Comparable<Customer> {
    private String customerType;
    private String address;

    private String voucher;

    public Customer(String id, String name, LocalDate dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
        this.voucher = "None";
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return id + "," + name + "," + dateOfBirth + "," + gender + "," +
                identityNumber + "," + phoneNumber + "," + email + "," +
                customerType + "," + address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.getId().compareTo(o.getId());
    }
}
