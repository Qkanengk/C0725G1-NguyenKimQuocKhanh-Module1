package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Truck;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Vehicle;

public interface ITruckRepository {

    Truck[] findAll();

    void add(Truck truck);

    void delete(String licensePlate);

    void update(String license,Truck truck);
}
