package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Truck;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.ITruckRepository;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository = new TruckRepository();

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public void delete(String licensePlate) {
        truckRepository.delete(licensePlate);
    }

    @Override
    public void edit(String licensePlate, Truck truck) {
        truckRepository.edit(licensePlate, truck);
    }

    @Override
    public Truck find(String licensePlate) {
        return truckRepository.find(licensePlate);
    }

    @Override
    public List<Truck> getList() {
        return List.of();
    }

    @Override
    public void showList() {
        truckRepository.showList();
    }
}
