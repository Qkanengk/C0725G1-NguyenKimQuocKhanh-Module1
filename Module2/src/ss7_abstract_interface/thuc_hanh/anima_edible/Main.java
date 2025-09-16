package ss7_abstract_interface.thuc_hanh.anima_edible;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Tiger tiger = new Tiger();
        Apple apple = new Apple();
        Orange orange = new Orange();

        System.out.println(chicken.sound());
        System.out.println(chicken.howToEat());
        System.out.println(tiger.sound());
        System.out.println(apple.howToEat());
        System.out.println(orange.howToEat());
    }
}
