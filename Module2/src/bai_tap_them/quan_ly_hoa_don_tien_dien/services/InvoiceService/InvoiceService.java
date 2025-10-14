package bai_tap_them.quan_ly_hoa_don_tien_dien.services.InvoiceService;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.Customer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.IForeignCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository.ILocalCustomerRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice.IInvoiceRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice.InvoiceRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.ForeignCustomerService;
import bai_tap_them.quan_ly_hoa_don_tien_dien.services.CustomerService.LocalCustomerService;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService implements IInvoiceService {
    private static IInvoiceRepository invoiceRepository = new InvoiceRepository();
    private static ILocalCustomerRepository localCustomerService = LocalCustomerService.getLocalCustomerRepository();
    private static IForeignCustomerRepository foreignCustomerService = ForeignCustomerService.getForeignCustomerRepository();

    @Override
    public boolean add(Invoice invoice) {
        List<Customer> customerList = new ArrayList<>(localCustomerService.findAll());
        customerList.addAll(foreignCustomerService.findAll());
        if (customerList.isEmpty()) {
            return false;
        }
        for (Customer customer : customerList) {
            if (customer.getId().equals(invoice.getCustomerId())) {
                List<Invoice> invoiceList = findAll();
                if (invoiceList.isEmpty()) {
                    invoice.setId(String.valueOf(1));
                } else {
                    Invoice lastInvoice = invoiceList.get(invoiceList.size() - 1);
                    invoice.setId(String.valueOf(Integer.parseInt(lastInvoice.getId()) + 1));
                }
                break;
            }
            return false;
        }
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
