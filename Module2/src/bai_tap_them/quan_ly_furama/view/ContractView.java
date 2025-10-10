package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Contract;
import bai_tap_them.quan_ly_furama.utils.validate.BookingValidate;
import bai_tap_them.quan_ly_furama.utils.validate.ContractValidate;

import java.time.LocalDate;
import java.util.Scanner;

public class ContractView {
    private static Scanner scanner = new Scanner(System.in);

    public static String bookingId() {
        String bookingId;
        do {
            System.out.println("Enter booking's ID");
            bookingId = scanner.nextLine();
        } while (!BookingValidate.validateBookingId(bookingId));
        return bookingId;
    }

    public static String contractId() {
        String contractId;
        do {
            System.out.println("Enter contract's ID");
            contractId = scanner.nextLine();
        } while (!ContractValidate.validateContractId(contractId));
        return contractId;
    }

    public static double depositAmount() {
        double depositAmount = 0.0;
        do {
            try {
                System.out.println("Enter deposit amount");
                depositAmount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }
        } while (depositAmount <= 0);
        return depositAmount;
    }

    public static double paymentAmount() {
        double paymentAmount = 0.0;
        do {
            try {
                System.out.println("Enter payment amount");
                paymentAmount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }
        } while (paymentAmount <= 0);
        return paymentAmount;
    }

    public static Contract getContract() {
        return new Contract(contractId(), bookingId(), depositAmount(), paymentAmount());
    }
}
