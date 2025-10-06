package bai_tap_them.quan_ly_furama.view;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.service.FacilityService;
import bai_tap_them.quan_ly_furama.utils.validate.BookingValidate;
import bai_tap_them.quan_ly_furama.utils.validate.CustomerValidate;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BookingView {
    private static Scanner scanner = new Scanner(System.in);

    public static String bookingId() {
        String id;
        do {
            System.out.println("Input booking's ID");
            id = scanner.nextLine();
        } while (!(BookingValidate.validateBookingId(id)));
        return id;
    }

    public static LocalDate bookingDate() {
        return LocalDate.now();
    }

    public static LocalDate startDate() {
        String startDate;
        do {
            System.out.println("Input start date");
            startDate = scanner.nextLine();
        } while (!(BookingValidate.validateBookingStartDate(startDate))||LocalDate.parse(startDate).isBefore(LocalDate.now()));
        return LocalDate.parse(startDate);
    }

    public static LocalDate endDate() {
        String endDate;
        do {
            System.out.println("Input end date");
            endDate = scanner.nextLine();
            try {
                LocalDate.parse(endDate);
            }catch (DateTimeParseException e){
                continue;
            }
        } while (!BookingValidate.validateBookingEndDate(endDate)||LocalDate.parse(endDate).isBefore(LocalDate.now())||LocalDate.parse(endDate).isBefore(LocalDate.now().plusDays(1)));
        return LocalDate.parse(endDate);
    }

    public static String customerId() {
        String customerId;
        do {
            System.out.println("Enter customer's ID");
            customerId = scanner.nextLine();
        } while (!CustomerValidate.validateId(customerId));
        return customerId;
    }

    public static String serviceId() {
        String serviceId;
        do {
            System.out.println("Enter service");
            serviceId = scanner.nextLine();
        } while (!(BookingValidate.validateServiceId(serviceId)));
        return serviceId;
    }

    public static Booking getBooking() {
        return new Booking(bookingId(), bookingDate(), startDate(), endDate(), customerId(), serviceId());
    }
}
