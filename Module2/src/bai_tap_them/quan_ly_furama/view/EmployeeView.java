package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;

import java.util.Scanner;

public class EmployeeView {
    public static String employeeCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's code");
        String employeeCode = scanner.nextLine();
        return employeeCode;
    }

    public static String employeeName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's name");
        String employeeName = scanner.nextLine();
        return employeeName;
    }


    public static String employeeDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's date of birth");
        String employeeDateOfBirth = scanner.nextLine();
        return employeeDateOfBirth;
    }

    public static String employeeSex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's sex");
        String employeeSex = scanner.nextLine();
        return employeeSex;
    }

    public static String employeeIdNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's id number");
        String employeeIdNumber = scanner.nextLine();
        return employeeIdNumber;
    }

    public static String employeePhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's phone number");
        String employeePhoneNumber = scanner.nextLine();
        return employeePhoneNumber;
    }

    public static String employeeEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's email");
        String employeeEmail = scanner.nextLine();
        return employeeEmail;
    }

    public static String employeeEducation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's education");
        String employeeEducation = scanner.nextLine();
        return employeeEducation;
    }

    public static String employeePosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's position");
        String employeePosition = scanner.nextLine();
        return employeePosition;
    }

    public static double employeeSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's salary");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        return employeeSalary;
    }

    public static Employee inputAddData() {
        Scanner scanner = new Scanner(System.in);
        String employeeCode = employeeCode();
        String employeeName = employeeName();
        String employeeDateOfBirth = employeeDateOfBirth();
        String employeeSex = employeeSex();
        String employeeIdNumber = employeeIdNumber();
        String employeePhoneNumber = employeePhoneNumber();
        String employeeEmail = employeeEmail();
        String employeeEducation = employeeEducation();
        String employeePosition = employeePosition();
        double employeeSalary = employeeSalary();

        Employee employee = new Employee(
                employeeCode,
                employeeName,
                employeeDateOfBirth,
                employeeSex,
                employeeIdNumber,
                employeePhoneNumber,
                employeeEmail,
                employeeEducation,
                employeePosition,
                employeeSalary);
        return employee;
    }

    public static void inputEditData() {

    }
}
