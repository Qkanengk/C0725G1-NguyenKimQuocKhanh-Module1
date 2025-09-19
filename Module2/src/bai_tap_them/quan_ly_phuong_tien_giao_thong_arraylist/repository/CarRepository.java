package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    static List<Car> carsList = new ArrayList<>();

    static {
        carsList.add(new Car("22012", "Toyota", 2012, "Khanh", 10, "sedan"));
    }

    @Override
    public void add(Car car) {
        carsList.add(car);
    }

    @Override
    public void delete(String licensePlate) {
        carsList.removeIf(car -> car.getLicensePlate().equals(licensePlate));
    }

    @Override
    public void edit(String licensePlate,Car car) {
        for (Car car1 : carsList) {
            if (car1.getLicensePlate().equals(licensePlate)) {
                car1 = car;
            }
        }
    }

    @Override
    public Car find(String licensePlate) {
        Car car1 = null;
        for (Car car: carsList){
            if (car.getLicensePlate().equals(licensePlate)){
                car1 = car;
            }
        }
        return car1;
    }

    @Override
    public List<Car> getList() {
        return carsList;
    }

    @Override
    public void showList() {
        for (Car car : carsList) {
            System.out.println(car.toString());
        }
    }

}
