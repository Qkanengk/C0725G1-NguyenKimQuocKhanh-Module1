package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.service.EmployeeService;
import bai_tap_them.quan_ly_furama.service.IEmployeeService;
import bai_tap_them.quan_ly_furama.view.EmployeeView;
import java.util.Scanner;

public class EmployeeController {
    private static IEmployeeService employeeService = new EmployeeService();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====Employee Management=====\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 4) {
                    System.out.println("ENTER AGAIN");
                }
            } catch (NumberFormatException e) {
                System.out.println("ENTER AGAIN");
                continue;
            }

            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
            }
        } while (choice != 4);
    }

    static void addEmployee() {
        System.out.println("=====ADD NEW EMPLOYEE=====");
        Employee employee = EmployeeView.getEmployee();
        employeeService.add(employee);
    }

    static void updateEmployee() {
        System.out.println("=====EDIT EMPLOYEE'S INFORMATION BY EMPLOYEE's CODE=====");
        String id = EmployeeView.id();
        Employee employee = EmployeeView.getEmployee();
        employeeService.update(id,employee);
    }

    static void displayList() {
        System.out.println("=====EMPLOYEE LIST=====");
        System.out.println(employeeService.findAll());
    }
}
