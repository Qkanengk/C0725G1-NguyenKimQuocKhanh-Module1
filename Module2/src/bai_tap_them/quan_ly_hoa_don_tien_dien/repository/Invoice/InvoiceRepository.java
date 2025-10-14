package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.Invoice;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Invoice.Invoice;
import bai_tap_them.quan_ly_hoa_don_tien_dien.utils.ReadAndWriteCsv;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository implements IInvoiceRepository {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final File filepath = new File("src/bai_tap_them/quan_ly_hoa_don_tien_dien/data/invoice.csv");


    @Override
    public boolean update(String id, Invoice invoice) {
        List<Invoice> invoiceList = findAll();
        if (invoiceList.isEmpty()) return false;
        for (Invoice invoice1 : invoiceList) {
            if (invoice1.getId().equals(invoice.getId())) {
                invoice.setId(invoice1.getId());
                invoiceList.set(invoiceList.indexOf(invoice1), invoice);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Invoice invoice) {
        List<Invoice> invoiceList = findAll();
        for (Invoice invoice1 : invoiceList) {
            if (invoice1.getId().equals(invoice.getId())) {
                return false;
            }
            break;
        }
        invoiceList.add(invoice);
        List<String> stringList = new ArrayList<>();
        stringList.add(invoice.getInfo());
        try {
            ReadAndWriteCsv.writeDataIntoCSV(filepath, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Invoice> findAll() {
        List<Invoice> invoiceList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCsv.readDataFromCSV(filepath);
            for (String line : data) {
                String[] arr = line.split(",");
                invoiceList.add(new Invoice(arr[0], arr[1], LocalDate.parse(arr[2],formatter), Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5])));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return invoiceList;
    }
}
