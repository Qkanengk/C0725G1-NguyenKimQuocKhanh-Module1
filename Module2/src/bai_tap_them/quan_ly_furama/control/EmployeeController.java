package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.service.EmployeeService.EmployeeService;
import bai_tap_them.quan_ly_furama.service.EmployeeService.IEmployeeService;
import bai_tap_them.quan_ly_furama.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {
    private static IEmployeeService employeeManager = new EmployeeService();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====Employee Management=====\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    editEmployee();
                    break;
            }
        } while (choice != 4);
    }

    static void addEmployee() {
        System.out.println("=====ADD NEW EMPLOYEE=====");
        Employee employeeData = EmployeeView.inputAddData();
        employeeManager.addEmployee(employeeData);
    }

    static void editEmployee() {
        System.out.println("=====EDIT EMPLOYEE'S INFORMATION BY EMPLOYEE's CODE=====");
        String employeeCode = EmployeeView.employeeCode();
        String employeeName = EmployeeView.employeeName();
        String employeeDateOfBirth = EmployeeView.employeeDateOfBirth();
        String employeeSex = EmployeeView.employeeSex();
        String employeeIdNumber = EmployeeView.employeeIdNumber();
        String employeePhoneNumber = EmployeeView.employeePhoneNumber();
        String employeeEmail = EmployeeView.employeeEmail();
        String employeeEducation = EmployeeView.employeeEducation();
        String employeePosition = EmployeeView.employeePosition();
        double employeeSalary = EmployeeView.employeeSalary();
        employeeManager.editEmployee(
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
    }

    static void displayList() {
        System.out.println("=====EMPLOYEE LIST=====");
        System.out.println(employeeManager.displayList());
    }
}
