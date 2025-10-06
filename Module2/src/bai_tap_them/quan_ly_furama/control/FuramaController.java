package bai_tap_them.quan_ly_furama.control;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice>6){
                    System.out.println("INPUT AGAIN");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("INPUT AGAIN");
                continue;
            }

            switch (choice) {
                case 1:
                    EmployeeController.displayMenu();
                    break;
                case 2:
                    CustomerController.displayMenu();
                    break;
                case 3:
                    FacilityController.displayMenu();
                    break;
                case 4:
                    BookingController.displayMainMenu();
                    break;
                case 5:
                    break;

            }
        } while (choice != 6);
    }
}
