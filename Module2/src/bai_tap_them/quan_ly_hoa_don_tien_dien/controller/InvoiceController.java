package bai_tap_them.quan_ly_hoa_don_tien_dien.controller;

import bai_tap_them.quan_ly_hoa_don_tien_dien.services.InvoiceService.InvoiceService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.view.InvoiceView.InvoiceView;

public class InvoiceController {
    private static InvoiceService invoiceService = new InvoiceService();

    public static InvoiceService getInvoiceService() {
        return invoiceService;
    }

    public static void addInvoice() {
        InvoiceView.addInvoice();

    }

    public static void showListInvoice() {
        InvoiceView.showListInvoice();
    }

    public static void updateInvoice() {
        InvoiceView.updateInvoice();
    }
}
