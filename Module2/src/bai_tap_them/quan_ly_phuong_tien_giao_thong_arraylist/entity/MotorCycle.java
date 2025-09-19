package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity;

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

    @Override
    public String toString() {
        return "   ======================" +
                "\n||Biển kiểm soát: " + getLicensePlate() +
                "\n||Hãng sản xuất: " + getManufacturerName() +
                "\n||Năm sản xuất: " + getManufactureYear() +
                "\n||Chủ sở hữu: " + getOwner() +
                "\n||Công suất:" + getEnginePower();
    }
}
