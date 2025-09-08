package ss1_overview_java.thuc_hanh;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang:");
        month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 8, 10, 11, 12:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 2:
                System.out.println("Thang " + month + " co 28 hoac 29 ngay");
                break;
            case 4, 6, 7, 9:
                System.out.println("Thang " + month + "co 30 ngay");
                break;
            default:
                System.out.println("Khong co thang nay!");
        }
    }
}
