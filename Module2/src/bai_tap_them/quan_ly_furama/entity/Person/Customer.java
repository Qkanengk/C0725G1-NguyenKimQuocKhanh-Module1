package bai_tap_them.quan_ly_furama.entity.Person;

public class Customer extends Person {

    private String customerAddress;
    private String customerType;

    public Customer(String code, String name, String dateOfBirth, String sex, String idNumber, String phoneNumber, String email, String customerAddress, String customerType) {
        super(code, name, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerCode: " + super.getCode() +
                "CustomerName: " + super.getName() +
                "CustomerDateOfBirth: " + super.getDateOfBirth() +
                "CustomerSex: " + super.getSex() +
                "CustomerIdNumber: " + super.getIdNumber() +
                "CustomerEmail: " + super.getEmail() +
                "customerAddress: " + customerAddress +
                ", customerType: " + customerType +
                '}';
    }
}