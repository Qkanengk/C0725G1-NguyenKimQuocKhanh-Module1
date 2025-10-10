package bai_tap_them.quan_ly_nhan_su_cong_ty.view;

import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static String getId() {
        System.out.println("Enter ID");
        return scanner.nextLine();
    }

    public static String getName() {
        System.out.println("Enter Name");
        return scanner.nextLine();
    }

    public static String getDateOfBirth() {
        System.out.println("Enter date of birth");
        return scanner.nextLine();
    }

    public static String getPhoneNumber() {
        System.out.println("Enter phone number");
        return scanner.nextLine();
    }
}
