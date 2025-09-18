package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity;

public abstract class Vehicle {

    private String licensePlate;
    private String manufacturerName;
    private int manufactureYear;
    private String owner;

    public Vehicle(String licensePlate, String manufacturerName, int manufactureYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturerName = manufacturerName;
        this.manufactureYear = manufactureYear;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
