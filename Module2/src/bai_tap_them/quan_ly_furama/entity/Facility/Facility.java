package bai_tap_them.quan_ly_furama.entity.Facility;

public abstract class Facility {
    String serviceCode;
    String serviceName;
    double usableArea;
    double rentalCost;
    int maxPeople;
    String rentalType;

    public Facility(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public abstract String toString();
}
