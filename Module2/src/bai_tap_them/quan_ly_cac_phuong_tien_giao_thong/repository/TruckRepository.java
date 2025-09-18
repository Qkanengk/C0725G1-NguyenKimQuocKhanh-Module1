package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.repository;

import bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity.Truck;

public class TruckRepository implements ITruckRepository {
    private static Truck[] trucks = new Truck[10];
    static {
        trucks[0] = new Truck("10d3q", "Honda", 2020, "Nguyen Khanh", 100);
        trucks[0] = new Truck("10dlqq1", "Honda", 2020, "Nguyen Khanh", 100);
    }

    @Override
    public Truck[] findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] == null) {
                trucks[i] = truck;
                break;
            }
        }
    }

    @Override
    public void delete(String licensePlate) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i]!=null&&trucks[i].getLicensePlate().equals(licensePlate)){
                trucks[i] = null;
            }
        }
    }

    @Override
    public void update(String license,Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if(trucks[i].getLicensePlate().equals(license)){
                trucks[i] = truck;
                break;
            }
        }
    }
}
