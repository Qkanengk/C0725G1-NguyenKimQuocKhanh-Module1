package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;

public interface ICarService {
    Car[] findAll();

    void add(Car car);

    void delete(String licensePlate);

    void update(String license, Car car);
}
