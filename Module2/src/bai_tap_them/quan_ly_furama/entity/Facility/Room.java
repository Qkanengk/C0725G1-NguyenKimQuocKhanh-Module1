package bai_tap_them.quan_ly_furama.entity.Facility;

public class Room extends Facility{
    private String freeService;

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, RentalType rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
