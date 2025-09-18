package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Vehicle;

public interface ICarRepository {

    Car[] findAll();

    void add(Car car);

    void delete(String licensePlate);

    void update(String license,Car car);
}
