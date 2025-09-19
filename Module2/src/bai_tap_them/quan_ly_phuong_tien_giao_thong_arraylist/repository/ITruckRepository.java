package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Car;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Truck;

import java.util.List;

public interface ITruckRepository {
    public void add(Truck truck);

    public void delete(String licensePlate);

    public void edit(String licensePlate, Truck truck);

    public Truck find(String licensePlate);

    public List<Truck> getList();

    public void showList();
}
