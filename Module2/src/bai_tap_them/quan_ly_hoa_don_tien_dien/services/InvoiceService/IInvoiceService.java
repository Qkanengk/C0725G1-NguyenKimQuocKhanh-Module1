package bai_tap_them.quan_ly_hoa_don_tien_dien.services.InvoiceService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.IService;

import java.util.List;

public interface IInvoiceService extends IService<Invoice> {
    boolean update(String id, Invoice invoice);

}
