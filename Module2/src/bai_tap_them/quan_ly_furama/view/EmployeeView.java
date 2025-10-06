package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.utils.validate.EmployeeValidate;

import java.time.LocalDate;

import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String id() {
        String id;
        do {
            System.out.println("Input employee's ID");
            id = scanner.nextLine();
        } while (!EmployeeValidate.validateId(id));
        return id;
    }

    public static String name() {
        String name;
        do {
            System.out.println("Input employee's name");
            name = scanner.nextLine();
        } while (!EmployeeValidate.validateName(name));
        return name;
    }

    public static LocalDate dateOfBirth() {
        String dateOfBirth;

        do {
            System.out.println("Input employee's birthday (yyyy-MM-dd)");
            dateOfBirth = scanner.nextLine();
        } while (!EmployeeValidate.validateDateOfBirth(dateOfBirth) || LocalDate.parse(dateOfBirth).plusYears(18).isAfter(LocalDate.now()));
        return LocalDate.parse(dateOfBirth);
    }

    public static String gender() {
        System.out.println("Input employee's gender");
        String gender = scanner.nextLine();
        return gender;
    }

    public static String identityNumber() {
        String identityNumber;
        do {
            System.out.println("Input employee's identity number");
            identityNumber = scanner.nextLine();
        } while (!EmployeeValidate.validateIdentityNumber(identityNumber));

        return identityNumber;
    }

    public static String phoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Input employee's phone number");
            phoneNumber = scanner.nextLine();
        } while (!EmployeeValidate.validatePhoneNumber(phoneNumber));
        return phoneNumber;
    }

    public static String email() {
        String email;
        do {
            System.out.println("Input employee's email");
            email = scanner.nextLine();
        } while (!EmployeeValidate.validateEmail(email));

        return email;
    }

    public static String qualification() {
        System.out.println("Input employee's qualification");
        String qualification = scanner.nextLine();
        return qualification;
    }

    public static String position() {
        System.out.println("Input employee's position");
        String position = scanner.nextLine();
        return position;
    }

    public static Double salary() {
        Double salary = 0.0;
        do {
            try {
                System.out.println("Input employee's salary (salary > 0)");
                salary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (salary <= 0);

        return salary;
    }

    public static Employee getEmployee() {

        return new Employee(id(), name(), dateOfBirth(), gender(), identityNumber(), phoneNumber(), email(), qualification(), position(), salary());


    }


}
