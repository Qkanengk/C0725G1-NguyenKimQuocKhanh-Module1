package bai_tap_them.quan_ly_hoa_don_tien_dien.view.InvoiceView;

import bai_tap_them.quan_ly_hoa_don_tien_dien.controller.InvoiceController;
import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.InvoiceService.InvoiceService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.utils.validate.InvoiceValidate;
import bai_tap_them.quan_ly_hoa_don_tien_dien.view.CustomerView.CustomerView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InvoiceView {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static Scanner scanner = new Scanner(System.in);
    private static InvoiceService invoiceService = InvoiceController.getInvoiceService();

    public static String getId() {
        System.out.println("Nhập mã hóa đơn");
        return scanner.nextLine();
    }

    public static String getCustomerId() {
        System.out.println("Nhập mã khách hàng");
        return scanner.nextLine();
    }

    public static LocalDate getDate() {
        String date = "";
        do {
            try {
                System.out.println("Nhập ngày tạo hóa đơn");
                date = scanner.nextLine();
                LocalDate.parse(date, formatter);
            } catch (DateTimeParseException e) {
                continue;
            }
        } while (!InvoiceValidate.validateDate(date) || LocalDate.parse(date, formatter).isBefore(LocalDate.now()));
        return LocalDate.parse(date, formatter);

    }

    public static double getQuantity() {
        System.out.println("Nhập số lượng");
        return Double.parseDouble(scanner.nextLine());
    }

    public static double getUnitPrice() {
        System.out.println("Nhập đơn giá");
        return Double.parseDouble(scanner.nextLine());
    }

    public static Invoice getInvoice() {
        String customerId = getCustomerId();
        LocalDate date = getDate();
        double quantity = getQuantity();
        double unitPrice = getUnitPrice();
        double totalPrice = invoiceService.getTotalPrice(customerId, quantity, unitPrice);

        return new Invoice(customerId, date, quantity, unitPrice, totalPrice);
    }

    public static void addInvoice() {
        CustomerView.showListCustomer();
        if (invoiceService.add(getInvoice())) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }

    public static void showListInvoice() {
        System.out.println("=====Invoice=====");
        if (invoiceService.findAll().isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println(invoiceService.findAll());
        }
    }

    public static void updateInvoice() {
        showListInvoice();
        String id = getId();
        if (invoiceService.update(id, getInvoice())) {
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Cập nhật thất bại");
        }
    }
}
