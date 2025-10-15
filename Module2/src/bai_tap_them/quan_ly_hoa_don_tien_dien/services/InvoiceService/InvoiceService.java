package bai_tap_them.quan_ly_hoa_don_tien_dien.services.InvoiceService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.IForeignCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.ILocalCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice.IInvoiceRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice.InvoiceRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ForeignCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.LocalCustomerService;

import java.util.List;

public class InvoiceService implements IInvoiceService {
    private static IInvoiceRepository invoiceRepository = new InvoiceRepository();
    private static ILocalCustomerRepository localCustomerService = LocalCustomerService.getLocalCustomerRepository();
    private static IForeignCustomerRepository foreignCustomerService = ForeignCustomerService.getForeignCustomerRepository();

    private String generateNextId() {
        List<Invoice> invoiceList = findAll();

        if (invoiceList == null || invoiceList.isEmpty()) {
            return "MH-00001";  // ID đầu tiên
        }
        try {
            Invoice lastInvoice = invoiceList.get(invoiceList.size() - 1);
            String lastId = lastInvoice.getId();  // Ví dụ: MH-00099

            // Tách phần số
            String numberPart = lastId.substring(3);  // "00099"
            int nextNumber = Integer.parseInt(numberPart) + 1;// 100
            // Format lại với 5 chữ số
            // MH-00100
            return String.format("MH-%05d", nextNumber);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public boolean add(Invoice invoice) {
        invoice.setId(generateNextId());
        return invoiceRepository.add(invoice);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public boolean update(String id, Invoice invoice) {
        return invoiceRepository.update(id, invoice);
    }

    public double getTotalPrice(String id, double quantity, double unitPrice) {
        if (localCustomerService.findById(id) != null) {
            double consumption = localCustomerService.findById(id).getConsumption();
            if (consumption == 0) {
                return 0;
            } else if (quantity <= consumption) {
                return quantity * unitPrice;
            } else {
                return quantity * unitPrice + ((quantity - consumption) * unitPrice * 2.5);
            }
        } else if (foreignCustomerService.findById(id) != null) {
            return quantity * unitPrice;
        }
        return -1;
    }
}
