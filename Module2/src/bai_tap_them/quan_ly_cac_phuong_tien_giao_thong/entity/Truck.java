package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String manufacturerName, int manufactureYear, String owner, double loadCapacity) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
