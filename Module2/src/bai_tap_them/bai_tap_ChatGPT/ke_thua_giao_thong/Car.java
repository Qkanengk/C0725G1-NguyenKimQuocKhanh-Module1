package bai_tap_them.bai_tap_ChatGPT.ke_thua_giao_thong;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + getBrand() + " car");
    }
}
