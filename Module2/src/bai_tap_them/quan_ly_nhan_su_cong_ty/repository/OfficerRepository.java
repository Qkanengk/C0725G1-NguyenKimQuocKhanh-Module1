package bai_tap_them.quan_ly_nhan_su_cong_ty.repository;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Officer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.ReadAndWriteCSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OfficerRepository implements IOfficerRepository {
    private static final File file = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_nhan_su_cong_ty/data/OFFICER_DATA.csv");

    @Override
    public boolean add(Employee employee) {
        List<Officer> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Officer saler : salerList) {
            if (saler.getId().equals(employee.getId())) {
                return false;
            }
        }
        salerList.add((Officer) employee);
        stringList.add(employee.getInfo());
        try {
            ReadAndWriteCSV.write(file, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Officer> findAll() {
        List<Officer> salerList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCSV.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line : data) {
            String[] arr = line.split(",");
            salerList.add(new Officer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
        return salerList;
    }

    @Override
    public boolean remove(String id) {
        List<Officer> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Officer saler : salerList) {
            stringList.add(saler.getInfo());
        }
        salerList.removeIf(saler -> saler.getId().equals(id));
        try {
            ReadAndWriteCSV.write(file, stringList, false);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Officer> findByName(String name) {
        List<Officer> salerList = findAll();
        List<Officer> found = new ArrayList<>();
        for (Officer saler : salerList) {
            if (saler.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(saler);
            }
        }
        if (found.isEmpty()) {
            return null;
        }
        return found;
    }
}
