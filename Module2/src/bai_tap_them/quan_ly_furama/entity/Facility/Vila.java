package bai_tap_them.quan_ly_furama.entity.Facility;

public class Vila extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Vila(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentalType rentalType, String roomStandard, double poolArea, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
