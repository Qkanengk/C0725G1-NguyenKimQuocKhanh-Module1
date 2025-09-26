package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity;

public class Car extends Vehicle {
    private int numberOfSits;
    private String typeOfCar;

    public Car(String licensePlate, String manufacturerName, int manufactureYear, String owner, int numberOfSits, String typeOfCar) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.numberOfSits = numberOfSits;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getInfo() {
        return getLicensePlate() + "," + getManufacturerName() + "," + getManufactureYear() + "," + getOwner() + "," + getNumberOfSits() + "," + getTypeOfCar();
    }

    @Override
    public String toString() {
        return "   ======================" +
                "\n||Biển kiểm soát: " + getLicensePlate() +
                "\n||Hãng sản xuất: " + getManufacturerName() +
                "\n||Năm sản xuất: " + getManufactureYear() +
                "\n||Chủ sở hữu: " + getOwner() +
                "\n||Số chỗ ngồi:" + getNumberOfSits() +
                "\n||Kiểu: " + getTypeOfCar();
    }
}
