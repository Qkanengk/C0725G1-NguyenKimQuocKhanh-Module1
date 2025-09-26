package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.service;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.MotorCycle;

import java.util.List;

public interface IMotorCycleService {
    public void add(MotorCycle motorCycle);

    public void delete(String licensePlate);

    public void edit(String licensePlate, MotorCycle motorCycle);

    public MotorCycle find(String licensePlate);

    public List<MotorCycle> getList();

}
