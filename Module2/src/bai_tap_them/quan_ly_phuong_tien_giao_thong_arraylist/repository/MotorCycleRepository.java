package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.utils.ReadAndWriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MotorCycleRepository implements IMotorCycleRepository {
    private static final File MOTORCYCLE_LIST = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_phuong_tien_giao_thong_arraylist/data/MOTORCYCLE_LIST.csv");

    @Override
    public void add(MotorCycle motorCycle) {
        List<String> stringList = new ArrayList<>();
        stringList.add(motorCycle.getInfo());
        try {
            ReadAndWriteFile.writeListStringToCSV(MOTORCYCLE_LIST, stringList, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String licensePlate) {
        List<MotorCycle> motorCycleList = getList();
        motorCycleList.removeIf(motorCycle -> motorCycle.getLicensePlate().equals(licensePlate));
        List<String> stringList = new ArrayList<>();
        for (MotorCycle motorCycle : motorCycleList) {
            stringList.add(motorCycle.getInfo());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(MOTORCYCLE_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String licensePlate, MotorCycle motorCycle) {
        List<MotorCycle> motorCycleList = getList();
        for (int i = 0; i < motorCycleList.size(); i++) {
            if (motorCycleList.get(i).getLicensePlate().equals(licensePlate)) {
                motorCycleList.set(i, motorCycle);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (MotorCycle motorCycle2 : motorCycleList) {
            stringList.add(motorCycle2.getInfo());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(MOTORCYCLE_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public MotorCycle find(String licensePlate) {
        List<MotorCycle> motorCycleList = getList();
        for (MotorCycle motorCycle : motorCycleList) {
            if (motorCycle.getLicensePlate().equals(licensePlate)) {
                return motorCycle;
            }
        }
        return null;
    }

    @Override
    public List<MotorCycle> getList() {
        List<MotorCycle> motorCycleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        try {
            stringList = ReadAndWriteFile.readFileCSVToList(MOTORCYCLE_LIST);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : stringList) {
            String[] arr = line.split(",");
            motorCycleList.add(new MotorCycle(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4])));
        }
        return motorCycleList;
    }
}



