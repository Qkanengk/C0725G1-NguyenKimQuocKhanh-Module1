package bai_tap_them.quan_ly_furama.entity;

import bai_tap_them.quan_ly_furama.entity.Facility.Facility;
import bai_tap_them.quan_ly_furama.utils.BookingComparator;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private LocalDate bookingDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String serviceId;

    public Booking(String bookingId, LocalDate bookingDate, LocalDate startDate, LocalDate endDate, String customerId, String serviceId) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // cùng tham chiếu
        if (o == null || getClass() != o.getClass()) return false; // khác class
        Booking booking = (Booking) o;
        return bookingId != null && bookingId.equals(booking.bookingId);
    }

    @Override
    public int hashCode() {
        return bookingId != null ? bookingId.hashCode() : 0;
    }


    @Override
    public String toString() {
        return String.format(
                "-----------------------------\n" +
                        " Booking Information\n" +
                        "-----------------------------\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        "-----------------------------\n",
                "Booking ID", bookingId,
                "Booking Date", bookingDate,
                "Start Date", startDate,
                "End Date", endDate,
                "Customer ID", customerId,
                "Service ID", serviceId
        );
    }



}
