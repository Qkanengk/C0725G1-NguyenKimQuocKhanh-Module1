package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import bai_tap_them.quan_ly_furama.utils.validate.EmployeeValidate;
import bai_tap_them.quan_ly_nhan_su_cong_ty.controller.MainMenu;

import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getId() {
        String id;
        do {
            System.out.println("Enter ID");
            id = scanner.nextLine();
        } while (!EmployeeValidate.validateId(id));
        return id;
    }

    public static String getName() {
        String name;
        do {
            System.out.println("Enter name");
            name = scanner.nextLine();
        } while (!EmployeeValidate.validateName(name));
        return name;
    }

    public static String getDateOfBirth() {
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth (yyyy-MM-dd)");
            dateOfBirth = scanner.nextLine();
        } while (!EmployeeValidate.validateDateOfBirth(dateOfBirth));
        return dateOfBirth;
    }

    public static String getPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone number");
            phoneNumber = scanner.nextLine();
        } while (!EmployeeValidate.validatePhoneNumber(phoneNumber));
        return phoneNumber;
    }

    public static void showListEmployee() {
        System.out.println("=====Engineer=====");
        System.out.println(MainMenu.getEngineerService().findAll());
        System.out.println("=====Officer=====");
        System.out.println(MainMenu.getOfficerService().findAll());
        System.out.println("=====Saler=====");
        System.out.println(MainMenu.getSalerService().findAll());
    }

    public static void showListEmployeeFoundByName(String Name) {
        System.out.println("=====Employee found by name=====");
        if (MainMenu.getEngineerService().findByName(Name) == null && MainMenu.getOfficerService().findByName(Name) == null && MainMenu.getSalerService().findByName(Name) == null) {
            System.out.println("No employee found");
        } else {
            System.out.println(MainMenu.getEngineerService().findByName(Name));
            System.out.println(MainMenu.getOfficerService().findByName(Name));
            System.out.println(MainMenu.getSalerService().findByName(Name));
        }
    }
}
