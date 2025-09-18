package bai_tap_them.bai_tap_ChatGPT.ke_thua_giao_thong;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Bike("Martin");
        vehicles[1]= new Car("Honda");
        for (Vehicle vehicle:vehicles){
            vehicle.drive();
        }
    }
}
