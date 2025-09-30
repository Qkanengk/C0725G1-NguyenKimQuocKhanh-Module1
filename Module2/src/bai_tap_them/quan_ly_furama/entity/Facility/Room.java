package bai_tap_them.quan_ly_furama.entity.Facility;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
