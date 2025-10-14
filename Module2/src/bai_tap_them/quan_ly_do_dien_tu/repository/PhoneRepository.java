package bai_tap_them.quan_ly_do_dien_tu.repository;

import bai_tap_them.quan_ly_do_dien_tu.entity.Phone;
import bai_tap_them.quan_ly_do_dien_tu.utils.ReadAndWriteCSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneRepository implements IPhoneRepository {
    private static final Scanner scanner = new Scanner(System.in);
    private static final File filepath = new File("src/bai_tap_them/quan_ly_do_dien_tu/data/phone.csv");


    @Override
    public boolean add(Phone product) {
        List<Phone> phoneList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Phone phone : phoneList) {
            if (phone.getId().equals(product.getId())) {
                return false;
            }
        }
        phoneList.add(product);
        stringList.add(product.getInfo());
        try {
            ReadAndWriteCSV.writeDataToCSV(filepath, stringList, true);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteCSV.readDataFromCSV(filepath);
            for (String line : stringList) {
                String[] arr = line.split(",");
                phoneList.add(new Phone(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), Double.parseDouble(arr[4]), Double.parseDouble(arr[5])));
            }
            return phoneList;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public boolean remove(String id) {
        List<Phone> phoneList = findAll();
        List<String> stringList = new ArrayList<>();
        if (phoneList.isEmpty()) {
            return false;
        }
        for (Phone phone : phoneList) {
            if (phone.getProduct_id().equals(id)) {
                System.out.println("Y/N");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    phoneList.remove(phone);
                    break;
                }
                return false;
            } return false;
        }
        for (Phone phone : phoneList) {
            stringList.add(phone.getInfo());
        }
        try {
            ReadAndWriteCSV.writeDataToCSV(filepath, stringList, false);
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    @Override
    public List<Phone> findByName(String name) {
        List<Phone> phoneList = findAll();
        List<Phone> found = new ArrayList<>();
        for (Phone phone : phoneList) {
            if (phone.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(phone);
            }
        }
        return found;
    }
}
