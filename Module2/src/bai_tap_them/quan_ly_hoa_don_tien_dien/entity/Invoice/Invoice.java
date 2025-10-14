package bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String id;
    private String customerId;
    private LocalDate date;
    private double quantity;
    private double unitPrice;
    private double totalPrice;

    public Invoice(String customerId, LocalDate date, double quantity, double unitPrice, double totalPrice) {
        this.customerId = customerId;
        this.date = date;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Invoice(String id, String customerId, LocalDate date, double quantity, double unitPrice, double totalPrice) {
        this.id = id;
        this.customerId = customerId;
        this.date = date;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getInfo() {

        return getId() + "," + getCustomerId() + "," + getDate().format(formatter) + "," + getQuantity() + "," + getUnitPrice() + "," + getTotalPrice();
    }

    @Override
    public String toString() {
        return String.format(
                "Invoice ID: %s | Customer ID: %s | Date: %s | Quantity: %.2f kWh | Unit Price: %.2f | Total: %.2f\n",
                id, customerId, date.format(formatter), quantity, unitPrice, totalPrice
        );
    }
}
