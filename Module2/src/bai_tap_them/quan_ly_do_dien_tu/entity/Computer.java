package bai_tap_them.quan_ly_do_dien_tu.entity;

public class Computer extends Product {
    private String cpuType;
    private int ramCapacity;

    public Computer(String id, String product_id, String name, double price, String cpuType, int ramCapacity) {
        super(id, product_id, name, price);
        this.cpuType = cpuType;
        this.ramCapacity = ramCapacity;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getInfo() {
        return super.getInfo() + "," + getCpuType() + "," + getRamCapacity();
    }

    @Override
    public String toString() {
        return String.format("%s" +
                        " %-15s : %s\n" +
                        " %-15s : %d gb\n" +
                        "-----------------------------\n",
                super.toString(),
                "CPU", getCpuType(),
                "RAM", getRamCapacity());
    }
}
