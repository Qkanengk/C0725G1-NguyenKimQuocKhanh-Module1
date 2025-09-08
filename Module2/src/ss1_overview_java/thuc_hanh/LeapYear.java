package ss1_overview_java.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Is a leap year");
                } else System.out.println("Is not a leap year");
            } else System.out.println("Is a leap year");
        } else System.out.println("Is not a leap year");
    }
}
