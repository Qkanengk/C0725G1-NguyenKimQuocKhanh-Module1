package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.service.CustomerService.CustomerService;
import bai_tap_them.quan_ly_furama.service.CustomerService.ICustomerService;
import bai_tap_them.quan_ly_furama.view.CustomerView;


import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customerManager = new CustomerService();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    editCustomer();
                    break;
            }
        } while (choice != 4);
    }


    static void addCustomer() {
        System.out.println("=====ADD NEW CUSTOMER=====");
        Customer customerData = CustomerView.inputAddData();
        customerManager.addCustomer(customerData);
    }

    static void editCustomer() {
        System.out.println("=====EDIT CUSTOMER'S INFORMATION BY EMPLOYEE's CODE=====");
        String customerCode = CustomerView.customerCode();
        String customerName = CustomerView.customerName();
        String customerDateOfBirth = CustomerView.customerDateOfBirth();
        String customerSex = CustomerView.customerSex();
        String customerIdNumber = CustomerView.customerIdNumber();
        String customerPhoneNumber = CustomerView.customerPhoneNumber();
        String customerEmail = CustomerView.customerEmail();
        String customerAddress = CustomerView.customerAddress();
        String customerType = CustomerView.customerType();
        customerManager.editCustomer(
                customerCode,
                customerName,
                customerDateOfBirth,
                customerSex,
                customerIdNumber,
                customerPhoneNumber,
                customerEmail,
                customerAddress,
                customerType
        );
    }

    static void displayList() {
        System.out.println("=====CUSTOMER'S LIST=====");
        System.out.println(customerManager.displayListCustomer());
    }
}
