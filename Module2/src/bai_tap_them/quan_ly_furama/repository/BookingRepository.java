package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.service.BookingService;
import bai_tap_them.quan_ly_furama.service.CustomerService;
import bai_tap_them.quan_ly_furama.service.FacilityService;
import bai_tap_them.quan_ly_furama.utils.BookingComparator;

import java.time.LocalDate;
import java.util.*;

public class BookingRepository extends BookingComparator implements IBookingRepository {

    protected static TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());

    static {
        bookingTreeSet.add(new Booking("BK-1211", LocalDate.parse("2025-10-01"), LocalDate.parse("2005-12-12"), LocalDate
                .parse("2005-12-13"), "KH-2001", "SVVL-0001"));
        bookingTreeSet.add(new Booking("BK-1213", LocalDate.parse("2024-10-12"), LocalDate.parse("2005-12-12"), LocalDate
                .parse("2005-12-15"), "KH-1102", "SVVL-0001"));
    }

    @Override
    public List<Booking> findAll() {
        return new ArrayList<>(bookingTreeSet);
    }

    @Override
    public boolean add(Booking booking) {
        if (BookingService.bookingRepository.findById(booking.getBookingId()) != null || CustomerService.customerRepository.findById(booking.getCustomerId()) == null) {
            return false;
        } else {
            for (Facility facility : FacilityService.facilityRepository.findAll()) {
                if (booking.getServiceId().equals(facility.getServiceId())) {
                    bookingTreeSet.add(booking);
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void update(String id, Booking booking) {

    }

    @Override
    public void delete(String id) {
        for (Booking booking : bookingTreeSet) {
            if (booking.getBookingId().equals(id)) {
                bookingTreeSet.remove(booking);
                break;
            }
        }
    }

    @Override
    public Booking findById(String id) {
        for (Booking booking : bookingTreeSet) {
            if (booking.getBookingId().equals(id)) {
                return booking;
            }
        }
        return null;
    }
}
