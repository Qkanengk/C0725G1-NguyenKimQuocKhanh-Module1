package bai_tap_them.quan_ly_furama.entity.Person;

import java.time.LocalDate;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer(String id, String name, LocalDate dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
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
    public String getInfo(){
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
}
