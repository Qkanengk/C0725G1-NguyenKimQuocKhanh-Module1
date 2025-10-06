package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.repository.BookingRepository;
import bai_tap_them.quan_ly_furama.repository.IBookingRepository;

import java.util.List;

public class BookingService implements IBookingService {
    public static IBookingRepository bookingRepository = new BookingRepository();

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public boolean add(Booking booking) {
        if (bookingRepository.add(booking)) {
            FacilityService.facilityRepository.incrementUsage(booking.getServiceId());
            return true;
        }
        return false;
    }

    @Override
    public void update(String id, Booking booking) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Booking findById(String id) {
        return bookingRepository.findById(id);
    }
}
