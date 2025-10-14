package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.IRepository;

public interface IInvoiceRepository extends IRepository<Invoice> {
    boolean update(String id, Invoice invoice);
}
