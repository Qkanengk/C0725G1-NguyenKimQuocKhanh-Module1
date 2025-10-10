package bai_tap_them.quan_ly_furama.control;


import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.service.CustomerService;
import bai_tap_them.quan_ly_furama.service.ICustomerService;
import bai_tap_them.quan_ly_furama.view.CustomerView;
import java.util.Scanner;

public class CustomerController {

    private static ICustomerService customerService = new CustomerService();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 4) {
                    System.out.println("ENTER AGAIN");
                }

            } catch (NumberFormatException e) {
                continue;
            }

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
        Customer customer = CustomerView.getCustomer();
        customerService.add(customer);
    }

    static void editCustomer() {
        System.out.println("=====EDIT CUSTOMER'S INFORMATION BY EMPLOYEE's CODE=====");
        String id = CustomerView.id();
        Customer customer = CustomerView.getCustomer();
        customerService.update(id,customer);
    }

    static void displayList() {
        System.out.println("=====CUSTOMER'S LIST=====");
        System.out.println(customerService.findAll());
    }
}
