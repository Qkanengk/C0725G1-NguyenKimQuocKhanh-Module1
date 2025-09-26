package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.utils.ReadAndWriteFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static final File CAR_LIST = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_phuong_tien_giao_thong_arraylist/data/CAR_LIST.csv");
    private static final File CAR_LIST_BINARY = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_phuong_tien_giao_thong_arraylist/data/CAR_LIST.dat");

    @Override
    public void add(Car car) {
        List<Car> carList = getList();
        carList.add(car);
        try {
            ReadAndWriteFile.writeDataToBinaryFile(CAR_LIST_BINARY,carList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        List<String> stringList = new ArrayList<>();
//        stringList.add(car.getInfo());
//        try {
//            ReadAndWriteFile.writeListStringToCSV(CAR_LIST, stringList, true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void delete(String licensePlate) {
        List<Car> carList = getList();
        carList.removeIf(car -> car.getLicensePlate().equals(licensePlate));
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getInfo());
        }

        try {
            ReadAndWriteFile.writeListStringToCSV(CAR_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String licensePlate, Car car) {
        List<Car> carList = getList();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().equals(licensePlate)) {
                carList.set(i, car);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Car car1 : carList) {
            stringList.add(car1.getInfo());
        }

        try {
            ReadAndWriteFile.writeListStringToCSV(CAR_LIST, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Car find(String licensePlate) {
        List<Car> carList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getList() {
        List<Car> carList = new ArrayList<>();
//        List<String> stringList = new ArrayList<>();
//        try {
//            stringList = ReadAndWriteFile.readFileCSVToList(CAR_LIST);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (String line : stringList) {
//            String[] arr = line.split(",");
//            carList.add(new Car(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]));
//        }

        try {
            carList = ReadAndWriteFile.readBinaryFile(CAR_LIST_BINARY);
        } catch (Exception e) {

        }

        return carList;
    }

}
