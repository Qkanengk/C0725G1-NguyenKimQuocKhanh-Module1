package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.service;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;

public interface IMotorCycleService {
    MotorCycle[] findAll();

    void add(MotorCycle motorCycle);

    void delete(String licensePlate);

    void update(String license, MotorCycle motorCycle);
}
