package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.utils.ReadAndWriteData;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository  implements ICustomerRepository{
    private static final File filepath = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_furama/data/CUSTOMER_DATA.csv");

    @Override
    public List<Customer> findAll() {
        List<String> stringList = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>();
        try {
            stringList = ReadAndWriteData.readDataFromCSV(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : stringList) {
            String[] arr = line.split(",");
            customerList.add(new Customer(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    @Override
    public void add(Object o) {
        List<Customer> customerList = findAll();
        customerList.add((Customer) o);
        List<String> stringList = new ArrayList<>();
        stringList.add(((Customer) o).getInfo());
        try {
            ReadAndWriteData.writeDataToCSV(filepath, stringList, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String id, Object o) {
        List<Customer> customerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                customerList.set(i, (Customer) o);
                break;
            }
        }
        for (Customer customer : customerList) {
            stringList.add(customer.getInfo());
        }
        try {
            ReadAndWriteData.writeDataToCSV(filepath, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Object findById(String id) {
        return null;
    }
}
