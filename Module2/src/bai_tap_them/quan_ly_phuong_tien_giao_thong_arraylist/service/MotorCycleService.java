package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.IMotorCycleRepository;
import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.repository.MotorCycleRepository;

import java.util.List;

public class MotorCycleService implements IMotorCycleService {
    private IMotorCycleRepository motorCycleRepository = new MotorCycleRepository();

    @Override
    public void add(MotorCycle motorCycle) {
        motorCycleRepository.add(motorCycle);
    }

    @Override
    public void delete(String licensePlate) {
        motorCycleRepository.delete(licensePlate);
    }

    @Override
    public void edit(String licensePlate, MotorCycle motorCycle) {
        motorCycleRepository.edit(licensePlate, motorCycle);
    }

    @Override
    public MotorCycle find(String licensePlate) {
        return motorCycleRepository.find(licensePlate);
    }

    @Override
    public List<MotorCycle> getList() {
        return List.of();
    }

    @Override
    public void showList() {
        motorCycleRepository.showList();
    }
}
