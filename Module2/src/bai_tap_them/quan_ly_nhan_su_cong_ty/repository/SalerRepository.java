package bai_tap_them.quan_ly_nhan_su_cong_ty.repository;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Saler;
import bai_tap_them.quan_ly_nhan_su_cong_ty.utils.ReadAndWriteCSV;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalerRepository implements ISalerRepository {
    private static final File file = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_nhan_su_cong_ty/data/SALER_DATA.csv");

    @Override
    public boolean add(Employee employee) {
        List<Saler> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Saler saler : salerList) {
            if (saler.getId().equals(employee.getId())) {
                return false;
            }
        }
        salerList.add((Saler) employee);
        stringList.add(employee.getInfo());
        try {
            ReadAndWriteCSV.write(file, stringList, true);
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Saler> findAll() {
        List<Saler> salerList = new ArrayList<>();
        List<String> data;
        try {
            data = ReadAndWriteCSV.read(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String line : data) {
            String[] arr = line.split(",");
            salerList.add(new Saler(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
        return salerList;
    }

    @Override
    public boolean remove(String id) {
        List<Saler> salerList = findAll();
        List<String> stringList = new ArrayList<>();
        for (Saler saler : salerList) {
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
    public List<Saler> findByName(String name) {
        List<Saler> salerList = findAll();
        List<Saler> found = new ArrayList<>();
        for (Saler saler : salerList) {
            if (saler.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(saler);
            }
        }
        return found;
    }
}
