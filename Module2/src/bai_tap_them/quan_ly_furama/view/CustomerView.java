package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;

import java.util.Scanner;

public class CustomerView {
    public static String customerCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's code");
        String customerCode = scanner.nextLine();
        return customerCode;
    }

    public static String customerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's name");
        String customerName = scanner.nextLine();
        return customerName;
    }


    public static String customerDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's date of birth");
        String customerDateOfBirth = scanner.nextLine();
        return customerDateOfBirth;
    }

    public static String customerSex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's sex");
        String customerSex = scanner.nextLine();
        return customerSex;
    }

    public static String customerIdNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's id number");
        String customerIdNumber = scanner.nextLine();
        return customerIdNumber;
    }

    public static String customerPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's phone number");
        String customerPhoneNumber = scanner.nextLine();
        return customerPhoneNumber;
    }

    public static String customerEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's email");
        String customerEmail = scanner.nextLine();
        return customerEmail;
    }

    public static String customerAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's address");
        String customerAddress = scanner.nextLine();
        return customerAddress;
    }

    public static String customerType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer's type");
        String customerType = scanner.nextLine();
        return customerType;
    }


    public static Customer inputAddData() {
        String customerCode = customerCode();
        String customerName = customerName();
        String customerDateOfBirth = customerDateOfBirth();
        String customerSex = customerSex();
        String customerIdNumber = customerIdNumber();
        String customerPhoneNumber = customerPhoneNumber();
        String customerEmail = customerEmail();
        String customerAddress = customerAddress();
        String customerType = customerType();

        Customer customer = new Customer(
                customerCode,
                customerName,
                customerDateOfBirth,
                customerSex,
                customerIdNumber,
                customerPhoneNumber,
                customerEmail,
                customerAddress,
                customerType);
        return customer;
    }
}
