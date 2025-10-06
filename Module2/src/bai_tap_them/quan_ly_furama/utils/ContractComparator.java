package bai_tap_them.quan_ly_furama.utils;

import bai_tap_them.quan_ly_furama.entity.Booking;

import java.util.Comparator;

public class ContractComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getBookingDate().compareTo(o2.getBookingDate());
    }
}
