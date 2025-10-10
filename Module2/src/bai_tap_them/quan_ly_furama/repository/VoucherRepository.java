package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Booking;
import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.service.BookingService;
import bai_tap_them.quan_ly_furama.service.CustomerService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VoucherRepository implements IVoucherRepository {
    private static Stack<Customer> customerStack = new Stack<>();
    private static List<Booking> bookingList = new ArrayList<>();

    static {
        bookingList.addAll(BookingService.bookingRepository.findAll());
    }

    @Override
    public List<Customer> findAllByMonth() {
        customerStack.clear();
        bookingList.clear();
        for (int i = 0; i < BookingService.bookingRepository.findAll().size(); i++) {
            if (BookingService.bookingRepository.findAll().get(i).getBookingDate().getMonth() == LocalDate.now().getMonth()) {
                bookingList.add(BookingService.bookingRepository.findAll().get(i));
            }
        }
        for (int i = 0; i < bookingList.size(); i++) {
            customerStack.push(CustomerService.customerRepository.findById(bookingList.get(i).getCustomerId()));
        }
        return new ArrayList<>(customerStack);
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
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
}
