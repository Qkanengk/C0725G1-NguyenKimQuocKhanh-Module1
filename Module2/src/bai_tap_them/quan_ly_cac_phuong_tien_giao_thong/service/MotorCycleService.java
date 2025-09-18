package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository.IMotorCycleRepository;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository.MotorCycleRepository;

public class MotorCycleService implements IMotorCycleService {
    private IMotorCycleRepository motorCycleRepository = new MotorCycleRepository();

    public MotorCycle[] findAll() {
        return motorCycleRepository.findAll();
    }

    @Override
    public void add(MotorCycle motorCycle) {
        motorCycleRepository.add(motorCycle);
    }

    @Override
    public void delete(String licensePlate) {
        motorCycleRepository.delete(licensePlate);
    }

    @Override
    public void update(String license, MotorCycle motorCycle) {
        motorCycleRepository.update(license,motorCycle);
    }
}
