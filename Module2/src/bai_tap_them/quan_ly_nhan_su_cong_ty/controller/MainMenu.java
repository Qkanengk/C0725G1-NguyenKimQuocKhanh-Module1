package bai_tap_them.quan_ly_nhan_su_cong_ty.controller;


import bai_tap_them.quan_ly_nhan_su_cong_ty.service.EngineerService;
import bai_tap_them.quan_ly_nhan_su_cong_ty.service.IEmployeeService;
import bai_tap_them.quan_ly_nhan_su_cong_ty.service.OfficerService;
import bai_tap_them.quan_ly_nhan_su_cong_ty.service.SalerService;
import bai_tap_them.quan_ly_nhan_su_cong_ty.view.EmployeeView;
import bai_tap_them.quan_ly_nhan_su_cong_ty.view.EngineerView;
import bai_tap_them.quan_ly_nhan_su_cong_ty.view.OfficerView;
import bai_tap_them.quan_ly_nhan_su_cong_ty.view.SalerView;

import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService engineerService = new EngineerService();
    private static IEmployeeService salerService = new SalerService();
    private static IEmployeeService officerService = new OfficerService();

    public static IEmployeeService getOfficerService() {
        return officerService;
    }

    public static IEmployeeService getSalerService() {
        return salerService;
    }

    public static IEmployeeService getEngineerService() {
        return engineerService;
    }

    public static void showMenu() {
        int choice = 0;
        do {
            System.out.println("===Employee Management===\n" +
                    "1. Add employees\n" +
                    "2. Display list employees\n" +
                    "3. Remove employee by id\n" +
                    "4. Find employee by name\n" +
                    "5. Exit\n");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 5) {
                    System.out.println("INPUT AGAIN");
                }
            } catch (NumberFormatException e) {
                continue;
            }
            switch (choice) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    getListMenu();
                    break;
                case 3:
                    removeMenu();
                    break;
                case 4:
                    findMenu();
                    break;
            }

        } while (choice != 5);
    }

    static void addMenu() {
        int choice = 0;
        do {
            System.out.println("===Employee Management===\n" +
                    "1. Add engineer\n" +
                    "2. Add officer\n" +
                    "3. Add Saler\n" +
                    "4. Main menu");
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
                    engineerService.add(EngineerView.getEmployee());
                    break;
                case 2:
                    officerService.add(OfficerView.getEmployee());
                    break;
                case 3:
                    salerService.add(SalerView.getEmployee());
                    break;
            }

        } while (choice != 4);
    }

    static void removeMenu() {
        String id = EmployeeView.getId();
        engineerService.remove(id);
        officerService.remove(id);
        salerService.remove(id);
    }

    static void getListMenu() {
        EmployeeView.showListEmployee();
    }

    static void findMenu() {
EmployeeView.showListEmployeeFoundByName(EmployeeView.getName());
    }
}
