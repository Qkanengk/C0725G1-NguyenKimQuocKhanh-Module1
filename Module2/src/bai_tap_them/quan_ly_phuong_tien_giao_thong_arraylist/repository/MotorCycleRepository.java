package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;

import java.util.ArrayList;
import java.util.List;

public class MotorCycleRepository implements IMotorCycleRepository{
    static List<MotorCycle> motorCycleList = new ArrayList<>();

    static {
        motorCycleList.add(new MotorCycle("22a012", "Toyota", 2012, "Khanh", 10));
    }

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
        motorCycleList.removeIf(motorCycle -> motorCycle.getLicensePlate().equals(licensePlate));
    }

    @Override
    public void edit(String licensePlate,MotorCycle motorCycle) {
        for (MotorCycle motorCycle1 : motorCycleList) {
            if (motorCycle1.getLicensePlate().equals(licensePlate)) {
                motorCycle1=motorCycle;
            }
        }
    }

    @Override
    public MotorCycle find(String licensePlate) {
        MotorCycle motorCycle1= null;
        for (MotorCycle motorCycle: motorCycleList){
            if (motorCycle.getLicensePlate().equals(licensePlate)){
                motorCycle1 = motorCycle;
            }
        }
        return motorCycle1;
    }

    @Override
    public List<MotorCycle> getList() {
        return motorCycleList;
    }

    @Override
    public void showList() {
        for (MotorCycle motorCycle : motorCycleList) {
            System.out.println(motorCycle.toString());
        }
    }
}
