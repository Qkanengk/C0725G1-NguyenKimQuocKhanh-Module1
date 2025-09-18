package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository.CarRepository;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository.ICarRepository;


public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    public Car[] findAll() {
        return carRepository.findAll();
    }

    public void add(Car car) {
        carRepository.add(car);
    }

    public void delete(String licensePlate) {
        carRepository.delete(licensePlate);
    }
    @Override
    public void update(String license,Car car) {
        carRepository.update(license,car);
    }
}
