package ss7_abstract_interface.thuc_hanh.anima_edible;

public class Chicken extends Animal implements Edible {
    @Override
    String sound() {
        return "Chicken: cluck cluck";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
