package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.LocalCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.utils.ReadAndWriteCsv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalCustomerRepository implements ILocalCustomerRepository {
    private static final File filepath = new File("src/bai_tap_them/quan_ly_hoa_don_tien_dien/data/localCustomer.csv");

    @Override
    public List<LocalCustomer> findByName(String name) {
        List<LocalCustomer> localCustomerList = findAll();
        List<LocalCustomer> foundList = new ArrayList<>();
        for (LocalCustomer localCustomer : localCustomerList) {
            if (localCustomer.getName().toLowerCase().contains(name.toLowerCase())) {
                foundList.add(localCustomer);
            }
        }
        return foundList;
    }

    @Override
    public boolean add(LocalCustomer customer) {
        List<LocalCustomer> localCustomerList = findAll();
        for (LocalCustomer localCustomer : localCustomerList) {
            if (localCustomer.getId().equals(customer.getId())) {
                return false;
            }
            break;
        }
        localCustomerList.add(customer);
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfo());
        try {
            ReadAndWriteCsv.writeDataIntoCSV(filepath, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<LocalCustomer> findAll() {
        List<LocalCustomer> customerList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCsv.readDataFromCSV(filepath);
            for (String line : data) {
                String[] arr = line.split(",");
                customerList.add(new LocalCustomer(arr[0], arr[1], arr[2], Double.parseDouble(arr[3])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }

    @Override
    public LocalCustomer findById(String id) {
        for (LocalCustomer localCustomer : findAll()) {
            if (localCustomer.getId().equals(id)) {
                return localCustomer;
            }
        }
        return null;
    }
}
