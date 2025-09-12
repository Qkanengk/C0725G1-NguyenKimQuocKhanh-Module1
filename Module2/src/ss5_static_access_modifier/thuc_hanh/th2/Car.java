package ss5_static_access_modifier.thuc_hanh.th2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars = 0;

    Car(String name, String engine) {
        this.name = name;
        this.engine=engine;
        numberOfCars++;
    }
}
