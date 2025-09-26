package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;

import java.util.List;

public interface ICarRepository {
    public void add(Car car);

    public void delete(String licensePlate);

    public void edit(String licensePlate,Car car);

    public Car find(String licensePlate);

    public List<Car> getList();


}
