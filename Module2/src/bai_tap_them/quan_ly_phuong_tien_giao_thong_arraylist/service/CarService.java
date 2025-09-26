package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.CarRepository;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.ICarRepository;

import java.util.List;

public class CarService implements ICarService {
    private ICarRepository carRepository = new CarRepository();

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public void delete(String licensePlate) {
        carRepository.delete(licensePlate);
    }

    @Override
    public void edit(String licensePlate,Car car ) {
        carRepository.edit(licensePlate,car);
    }

    @Override
    public Car find(String licensePlate) {
        return carRepository.find(licensePlate);
    }

    @Override
    public List<Car> getList() {
        return carRepository.getList();
    }
}
