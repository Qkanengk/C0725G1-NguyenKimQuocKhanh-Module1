package bai_tap_them.quan_ly_hoa_don_tien_dien.repository.CustomerRepository;

import bai_tap_them.quan_ly_hoa_don_tien_dien.entity.Customer.ForeignCustomer;
import bai_tap_them.quan_ly_hoa_don_tien_dien.utils.ReadAndWriteCsv;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ForeignCustomerRepository implements IForeignCustomerRepository {
    private static final File filepath = new File("src/bai_tap_them/quan_ly_hoa_don_tien_dien/data/foreignCustomer.csv");
    @Override
    public List<ForeignCustomer> findByName(String name) {
        List<ForeignCustomer> foreignCustomerList = findAll();
        List<ForeignCustomer> foundList = new ArrayList<>();
        for (ForeignCustomer foreignCustomer : foreignCustomerList) {
            if (foreignCustomer.getName().toLowerCase().contains(name.toLowerCase())) {
                foundList.add(foreignCustomer);
            }
        }
        return foundList;
    }

    @Override
    public boolean add(ForeignCustomer foreignCustomer) {
        List<ForeignCustomer> foreignCustomerList = findAll();
        for (ForeignCustomer localCustomer : foreignCustomerList) {
            if (localCustomer.getId().equals(foreignCustomer.getId())) {
                return false;
            }
            break;
        }
        foreignCustomerList.add(foreignCustomer);
        List<String> stringList = new ArrayList<>();
        stringList.add(foreignCustomer.getInfo());
        try {
            ReadAndWriteCsv.writeDataIntoCSV(filepath, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ForeignCustomer> findAll() {
        List<ForeignCustomer> foreignCustomerList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCsv.readDataFromCSV(filepath);
            for (String line : data) {
                String[] arr = line.split(",");
                foreignCustomerList.add(new ForeignCustomer(arr[0], arr[1], arr[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return foreignCustomerList;
    }

    @Override
    public ForeignCustomer findById(String id) {
        for (ForeignCustomer foreignCustomer : findAll()) {
            if (foreignCustomer.getId().equals(id)) {
                return foreignCustomer;
            }
        }
        return null;
    }
}
