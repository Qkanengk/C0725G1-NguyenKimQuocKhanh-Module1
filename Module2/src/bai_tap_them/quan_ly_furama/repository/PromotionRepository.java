package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.service.BookingService;
import bai_tap_them.quan_ly_furama.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PromotionRepository implements IPromotionRepository {
    private static TreeSet<Customer> customerTreeSet = new TreeSet<>();
    private static List<Booking> bookingList = new ArrayList<>();

    static {
        bookingList.addAll(BookingService.bookingRepository.findAll());
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerTreeSet);
    }

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public void update(String id, Customer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public List<Customer> findAllByYear(int year) {
        customerTreeSet.clear();
        bookingList.clear();
        for (int i = 0; i < BookingService.bookingRepository.findAll().size(); i++) {
            if (BookingService.bookingRepository.findAll().get(i).getBookingDate().getYear()==year) {
                bookingList.add(BookingService.bookingRepository.findAll().get(i));
            }
        }
        for (int i = 0; i < bookingList.size(); i++) {
            customerTreeSet.add(CustomerService.customerRepository.findById(bookingList.get(i).getCustomerId()));
        }
        return new ArrayList<>(customerTreeSet);
    }
}
