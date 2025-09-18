package bai_tap_them.bai_tap_ChatGPT.ke_thua_giao_thong;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Riding a " + getBrand() + " bike");
    }
}
