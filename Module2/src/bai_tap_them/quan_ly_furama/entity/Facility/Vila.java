package bai_tap_them.quan_ly_furama.entity.Facility;

public class Vila extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Vila(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return String.format(
                "%s" +
                        " %-15s : %s\n" +
                        " %-15s : %.2f m²\n" +
                        " %-15s : %d\n" +
                        "-----------------------------\n",
                super.toString(),
                "Room Standard", roomStandard,
                "Pool Area", poolArea,
                "Floors", numberOfFloors
        );
    }
}
