package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Car;
import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.MotorCycle;

public class MotorCycleRepository implements IMotorCycleRepository {
    private static MotorCycle[] motorCycles = new MotorCycle[10];

    static {
        motorCycles[0] = new MotorCycle("10d3q", "Honda", 2020, "Nguyen Khanh", 100);
        motorCycles[1] = new MotorCycle("10dl1", "Honda", 2020, "Nguyen Khanh", 100);
    }

    @Override
    public MotorCycle[] findAll() {
        return motorCycles;
    }

    @Override
    public void add(MotorCycle motorCycle) {
        for (int i = 0; i < motorCycles.length; i++) {
            if (motorCycles[i] == null) {
                motorCycles[i] = motorCycle;
                break;
            }
        }
    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < motorCycles.length; i++) {
            if (motorCycles[i] != null && motorCycles[i].getLicensePlate().equals(licensePlate)) {
                motorCycles[i] = null;
            }
        }
    }

    @Override
    public void update(String license, MotorCycle motorCycle) {
        for (int i = 0; i < motorCycles.length; i++) {
            if (motorCycles[i].getLicensePlate().equals(license)) {
                motorCycles[i] = motorCycle;
                break;
            }
        }
    }
}
