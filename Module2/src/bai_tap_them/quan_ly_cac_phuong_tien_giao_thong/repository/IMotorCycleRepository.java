package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Vehicle;

public interface IMotorCycleRepository {

    MotorCycle[] findAll();

    void add(MotorCycle motorCycle);

    void delete(String licensePlate);

    void update(String license,MotorCycle motorCycle);
}
