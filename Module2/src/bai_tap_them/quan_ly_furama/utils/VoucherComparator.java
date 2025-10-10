package bai_tap_them.quan_ly_furama.utils;

import bai_tap_them.quan_ly_furama.entity.Booking;

import java.util.Comparator;

public class VoucherComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking b1, Booking b2) {
        return b1.getBookingDate().compareTo(b2.getBookingDate());

    }
}
