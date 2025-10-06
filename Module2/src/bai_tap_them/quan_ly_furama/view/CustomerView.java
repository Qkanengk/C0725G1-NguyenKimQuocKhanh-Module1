package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.utils.validate.CustomerValidate;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static String id() {
        String id;
        do {
            System.out.println("Input customer's ID");
            id = scanner.nextLine();
        } while (!CustomerValidate.validateId(id));
        return id;
    }

    public static String name() {
        String name;
        do {
            System.out.println("Input customer's name");
            name = scanner.nextLine();
        } while (!CustomerValidate.validateName(name));
        return name;
    }

    public static LocalDate dateOfBirth() {
        String dateOfBirth;
        LocalDate dob;
        do {
            System.out.println("Input customer's birthday (yyyy-MM-dd)");
            dateOfBirth = scanner.nextLine();

        } while (!CustomerValidate.validateDateOfBirth(dateOfBirth) || LocalDate.parse(dateOfBirth).plusYears(18).isAfter(LocalDate.now()));

        return LocalDate.parse(dateOfBirth);
    }

    public static String gender() {
        System.out.println("Input customer's gender");
        String gender = scanner.nextLine();
        return gender;
    }

    public static String identityNumber() {
        String identityNumber;
        do {
            System.out.println("Input customer's identity number");
            identityNumber = scanner.nextLine();
        } while (!CustomerValidate.validateIdentityNumber(identityNumber));

        return identityNumber;
    }

    public static String phoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Input customer's phone number");
            phoneNumber = scanner.nextLine();
        } while (!CustomerValidate.validatePhoneNumber(phoneNumber));
        return phoneNumber;
    }

    public static String email() {
        String email;

        do {
            System.out.println("Input customer's email");
            email = scanner.nextLine();
        } while (!CustomerValidate.validateEmail(email));

        return email;
    }

    public static String customerType() {
        System.out.println("Input customer's type");
        String customerType = scanner.nextLine();
        return customerType;
    }

    public static String address() {
        System.out.println("Input customer's address");
        String address = scanner.nextLine();
        return address;
    }

    public static Customer getCustomer() {
        return new Customer(id(),name(),dateOfBirth(),gender(),identityNumber(),phoneNumber(),email(),customerType(),address());
    }
}
