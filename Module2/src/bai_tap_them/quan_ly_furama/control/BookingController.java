package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.entity.Contract;
import bai_tap_them.quan_ly_furama.service.BookingService;
import bai_tap_them.quan_ly_furama.service.ContractService;
import bai_tap_them.quan_ly_furama.service.IBookingService;
import bai_tap_them.quan_ly_furama.service.IContractService;
import bai_tap_them.quan_ly_furama.view.BookingView;
import bai_tap_them.quan_ly_furama.view.ContractView;

import java.util.Scanner;

public class BookingController {
    private static IBookingService bookingService = new BookingService();
    private static IContractService contractRepository = new ContractService();

    static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 6) {
                    System.out.println("INPUT AGAIN");
                }
            } catch (NumberFormatException e) {
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("=====List of service=====");
                    System.out.println(FacilityController.facilityService.findAll());
                    System.out.println("=========================");
                    if (bookingService.add(BookingView.getBooking())){
                        System.out.println("Done");
                    } else System.out.println("BookingId was exist or ServiceId is not exist or Customer is not exist");
                    break;
                case 2:
                    System.out.println(bookingService.findAll());
                    break;
                case 3:
                    Contract contract = ContractView.getContract();
                    if(contractRepository.add(contract)){
                        System.out.println("Done");
                    }else System.out.println("Fail");
                    break;
                case 4:
                    System.out.println(contractRepository.findAll());
                    break;
                case 5:
                    break;

            }
        } while (choice != 6);
    }
}
