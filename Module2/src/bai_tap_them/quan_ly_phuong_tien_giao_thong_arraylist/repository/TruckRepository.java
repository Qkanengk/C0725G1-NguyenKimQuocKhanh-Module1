package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;


import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Truck;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.utils.ReadAndWriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static final File TRUCK_LIST = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_phuong_tien_giao_thong_arraylist/data/TRUCK_LIST.csv");

    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfo());
        try {
            ReadAndWriteFile.writeListStringToCSV(TRUCK_LIST, stringList, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String licensePlate) {
        List<Truck> truckList = getList();
        truckList.removeIf(truck -> truck.getLicensePlate().equals(licensePlate));
        List<String> stringList = new ArrayList<>();
        for (Truck truck : truckList) {
            stringList.add(truck.getInfo());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(TRUCK_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String licensePlate, Truck truck) {
        List<Truck> truckList = getList();
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().equals(licensePlate)) {
                truckList.set(i, truck);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Truck truck1 : truckList) {
            stringList.add(truck1.getInfo());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(TRUCK_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Truck find(String licensePlate) {
        List<Truck> truckList = getList();
        for (Truck truck : truckList) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    @Override
    public List<Truck> getList() {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        try {
            stringList = ReadAndWriteFile.readFileCSVToList(TRUCK_LIST);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : stringList) {
            String[] arr = line.split(",");
            truckList.add(new Truck(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4])));
        }
        return truckList;
    }


}
