package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;

public class CarRepository implements ICarRepository {
    private static Car[] cars = new Car[10];

    static {
        cars[0] = new Car("10d3q", "Honda", 2020, "Nguyen Khanh", 6, "Bán tải");
        cars[1] = new Car("10d2", "Honda", 2020, "Nguyen Khanh", 6, "Bán tải");
    }

    @Override
    public Car[] findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }
    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]!=null&&cars[i].getLicensePlate().equals(licensePlate)){
                cars[i] = null;
                break;
            }
        }
    }

    @Override
    public void update(String license,Car car) {
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getLicensePlate().equals(license)){
                cars[i] = car;
                break;
            }
        }
    }
}
