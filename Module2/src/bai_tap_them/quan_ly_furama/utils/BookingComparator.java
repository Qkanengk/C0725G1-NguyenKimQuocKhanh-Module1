package bai_tap_them.quan_ly_furama.utils;

import bai_tap_them.quan_ly_furama.entity.Booking;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        // First compare by start date
        if (b1.getBookingId().equals(b2.getBookingId())){
            return b1.getBookingId().compareTo(b2.getBookingId());
        }
        int startDateComparison = b1.getStartDate().compareTo(b2.getStartDate());
        if (startDateComparison != 0) {
            return startDateComparison;
        }

        // If start dates are equal, compare by end date
        int endDateComparison = b1.getEndDate().compareTo(b2.getEndDate());
        if (endDateComparison != 0) {
            return endDateComparison;
        }
        // If both dates are equal, compare by booking ID
        return b1.getBookingId().compareTo(b2.getBookingId());

    }
}
