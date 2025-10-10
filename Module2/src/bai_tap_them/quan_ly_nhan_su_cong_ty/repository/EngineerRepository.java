package bai_tap_them.quan_ly_nhan_su_cong_ty.repository;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Engineer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.ReadAndWriteCSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EngineerRepository implements IEngineerRepository{
    private static final File file = new File("src/bai_tap_them/quan_ly_nhan_su_cong_ty/data/ENGINEER_DATA.csv");

    @Override
    public boolean add(Employee employee) {
        List<Engineer> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Engineer saler : salerList) {
            if (saler.getId().equals(employee.getId())) {
                return false;
            }
        }
        salerList.add((Engineer) employee);
        stringList.add(employee.getInfo());
        try {
            ReadAndWriteCSV.write(file, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Engineer> findAll() {
        List<Engineer> salerList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCSV.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line : data) {
            String[] arr = line.split(",");
            salerList.add(new Engineer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
        return salerList;
    }

    @Override
    public boolean remove(String id) {
        List<Engineer> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Engineer saler : salerList) {
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
    public List<Engineer> findByName(String name) {
        List<Engineer> salerList = findAll();
        List<Engineer> found = new ArrayList<>();
        for (Engineer saler : salerList) {
            if (saler.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(saler);
            }
        }
        return found;
    }
}
