package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;


import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.CustomerType;
import bai_tap_them.quan_ly_hoa_don_tien_dien.repository.IRepository;
import bai_tap_them.quan_ly_hoa_don_tien_dien.utils.ReadAndWriteCsv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements IRepository<CustomerType> {
    private static final File filepath = new File("src/bai_tap_them/quan_ly_hoa_don_tien_dien/data/customerType.csv");

    @Override
    public boolean add(CustomerType customerType) {
        return false;
    }

    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCsv.readDataFromCSV(filepath);
            for (String line : data) {
                String[] arr = line.split(",");
                customerTypeList.add(new CustomerType(arr[0], arr[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerTypeList;
    }
}
