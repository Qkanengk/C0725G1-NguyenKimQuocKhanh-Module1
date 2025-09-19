package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    static List<Truck> truckList = new ArrayList<>();

    static {
        truckList.add(new Truck("22aa012", "Toyota", 2012, "Khanh", 10));
    }

    @Override
    public void add(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public void delete(String licensePlate) {
        truckList.removeIf(truck -> truck.getLicensePlate().equals(licensePlate));
    }

    @Override
    public void edit(String licensePlate, Truck truck) {
        for (Truck truck1 : truckList) {
            if (truck1.getLicensePlate().equals(licensePlate)) {
                truck1 = truck;
            }
        }
    }

    @Override
    public Truck find(String licensePlate) {
        Truck truck = null;
        for (Truck truck1 : truckList) {
            if (truck1.getLicensePlate().equals(licensePlate)) {
                truck = truck1;
            }
        }
        return truck;
    }

    @Override
    public List<Truck> getList() {
        return truckList;
    }

    @Override
    public void showList() {
        for (Truck truck : truckList) {
            System.out.println(truck.toString());
        }
    }
}
