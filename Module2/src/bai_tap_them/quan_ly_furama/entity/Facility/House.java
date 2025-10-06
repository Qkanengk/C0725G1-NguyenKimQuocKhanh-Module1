package bai_tap_them.quan_ly_furama.entity.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceId, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                "%s" +   // Gọi từ Facility
                        " %-15s : %s\n" +
                        " %-15s : %d\n" +
                        "-----------------------------",
                super.toString(),
                "Room Standard", roomStandard,
                "Floors", numberOfFloors
        );
    }
}
