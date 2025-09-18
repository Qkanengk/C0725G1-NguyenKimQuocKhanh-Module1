package bai_tap_them.quan_ly_cac_phuong_tien_giao_thong.entity;

public class Car extends Vehicle{
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
}
