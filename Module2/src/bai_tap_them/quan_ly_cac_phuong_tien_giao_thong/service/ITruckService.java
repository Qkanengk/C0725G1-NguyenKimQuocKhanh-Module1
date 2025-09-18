package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Truck;

public interface ITruckService {
    Truck[] findAll();

    void add(Truck truck);

    void delete(String licensePlate);

    void update(String license, Truck truck);
}
