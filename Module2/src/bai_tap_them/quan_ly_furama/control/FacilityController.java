package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.service.FacilityService;
import bai_tap_them.quan_ly_furama.service.IFacilityService;
import bai_tap_them.quan_ly_furama.view.FacilityView;

import java.util.Scanner;

public class FacilityController {
    protected static IFacilityService facilityService = new FacilityService();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 4) {
                    System.out.println("INPUT AGAIN");
                }

            } catch (NumberFormatException e) {
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println(facilityService.findAll() + "\n");
                    break;
                case 2:
                    addFacility();
                    break;
                case 3:
                    System.out.println(facilityService.getMaintenanceList() + "\n");
                    break;
            }
        } while (choice != 4);
    }

    static void addFacility() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 4) {
                    System.out.println("INPUT AGAIN");
                }

            } catch (NumberFormatException e) {
                continue;
            }
            switch (choice) {
                case 1:
                    Facility vila = FacilityView.getVila();
                    if (facilityService.add(vila)) {
                        System.out.println("Add success!");
                    } else System.out.println("Add fail!");
                    break;
                case 2:
                    Facility house = FacilityView.getHouse();
                    if (facilityService.add(house)) {
                        System.out.println("Add success!");
                    } else System.out.println("Add fail!");
                    break;
                case 3:
                    Facility room = FacilityView.getRoom();
                    if (facilityService.add(room)) {
                        System.out.println("Add success!");
                    } else System.out.println("Add fail!");
                    break;
            }
        } while (choice != 4);
    }
}
