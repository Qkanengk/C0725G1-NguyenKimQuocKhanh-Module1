package bai_tap_them.quan_ly_furama.entity.Facility;

public abstract class Facility {
    String serviceId;
    String serviceName;
    double usableArea;
    double rentalCost;
    int maxPeople;
    String rentalType;

    public Facility(String serviceId, String serviceName, double usableArea, double rentalCost, int maxPeople, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // cùng tham chiếu
        if (o == null || getClass() != o.getClass()) return false; // khác class
        Facility facility = (Facility) o;
        return serviceId != null && serviceId.equals(facility.serviceId);
    }

    @Override
    public int hashCode() {
        return serviceId != null ? serviceId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.format(
                "-----------------------------\n" +
                        " Facility Information\n" +
                        "-----------------------------\n" +
                        " %-15s : %s\n" +
                        " %-15s : %s\n" +
                        " %-15s : %.2f m²\n" +
                        " %-15s : %.2f VND\n" +
                        " %-15s : %d\n" +
                        " %-15s : %s\n" +
                        "-----------------------------\n",
                "Service ID", serviceId,
                "Service Name", serviceName,
                "Usable Area", usableArea,
                "Rental Cost", rentalCost,
                "Max People", maxPeople,
                "Rental Type", rentalType
        );
    }
}
