package bai_tap_them.quan_ly_do_dien_tu.repository;

import bai_tap_them.quan_ly_do_dien_tu.entity.Computer;
import bai_tap_them.quan_ly_do_dien_tu.utils.ReadAndWriteCSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerRepository implements IComputerRepository {
    private static final File filepath = new File("src/bai_tap_them/quan_ly_do_dien_tu/data/computer.csv");
    private static final Scanner scanner = new Scanner(System.in);

    public boolean add(Computer product) {
        List<Computer> computerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Computer computer : computerList) {
            if (computer.getProduct_id().equals(product.getProduct_id())) {
                return false;
            }
        }
        computerList.add(product);
        stringList.add(product.getInfo());
        try {
            ReadAndWriteCSV.writeDataToCSV(filepath, stringList, true);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public List<Computer> findAll() {
        List<Computer> computerList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteCSV.readDataFromCSV(filepath);
            for (String line : stringList) {
                String[] arr = line.split(",");
                computerList.add(new Computer(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), arr[4], Integer.parseInt(arr[5])));
            }
            return computerList;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public boolean remove(String id) {
        List<Computer> computerList = findAll();
        List<String> stringList = new ArrayList<>();
        if (computerList.isEmpty()) {
            return false;
        }
        for (Computer computer : computerList) {
            if (computer.getProduct_id().equals(id)) {
                System.out.println("Y/N");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    computerList.remove(computer);
                    break;
                }
                return false;
            } return false;
        }
        for (Computer computer : computerList) {
            stringList.add(computer.getInfo());
        }
        try {
            ReadAndWriteCSV.writeDataToCSV(filepath, stringList, false);
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    @Override
    public List<Computer> findByName(String name) {
        List<Computer> phoneList = findAll();
        List<Computer> found = new ArrayList<>();
        for (Computer phone : phoneList) {
            if (phone.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(phone);
            }
        }
        return found;
    }
}
