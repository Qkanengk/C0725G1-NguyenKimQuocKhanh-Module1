package bai_tap_them.quan_ly_furama.entity.Facility;

public class House extends Facility{
    private String roomStandard;
    private int floors;

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentalType rentalType, String roomStandard, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
