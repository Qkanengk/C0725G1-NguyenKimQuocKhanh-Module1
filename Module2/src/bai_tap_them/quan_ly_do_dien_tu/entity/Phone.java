package bai_tap_them.quan_ly_do_dien_tu.entity;

public class Phone extends Product {
    private double batteryCapacity;
    private double screenSize;

    public Phone(String id, String product_id, String name, double price, double batteryCapacity, double screenSize) {
        super(id, product_id, name, price);
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getInfo() {
        return super.getInfo() + "," + getBatteryCapacity() + "," + getScreenSize();
    }

    @Override
    public String toString() {
        return String.format("%s" +
                        " %-15s : %s mAh\n" +
                        " %-15s : %.2f inch\n" +
                        "-----------------------------\n",
                super.toString(),
                "Battery Capacity", getBatteryCapacity(),
                "Screen size", getScreenSize());
    }
}
