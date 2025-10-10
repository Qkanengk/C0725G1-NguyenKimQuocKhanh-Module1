package bai_tap_them.quan_ly_furama.view;

import java.time.LocalDate;
import java.util.Scanner;

public class PromotionView {
    private static Scanner scanner = new Scanner(System.in);

    public static int getYear() {
        int year = 0;
        do {
            System.out.println("Enter a year");
            try {
                year = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }

        } while (year < LocalDate.now().minusYears(1).getYear());
        return year;
    }

}
