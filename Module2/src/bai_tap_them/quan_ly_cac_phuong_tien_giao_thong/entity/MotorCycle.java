package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity;

public class MotorCycle extends Vehicle {
    private double enginePower;

    public MotorCycle(String licensePlate, String manufacturerName, int manufactureYear, String owner, double enginePower) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }
}
