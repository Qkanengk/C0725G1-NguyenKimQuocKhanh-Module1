package bai_tap_them.bai_tap_ChatGPT.ke_thua_animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Tom",2);
        animals[1] = new Dog("Bear",1);
        for (Animal animal:animals){
            animal.makeSound();
        }
    }
}
