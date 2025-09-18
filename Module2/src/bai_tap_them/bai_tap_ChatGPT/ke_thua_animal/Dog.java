package bai_tap_them.bai_tap_ChatGPT.ke_thua_animal;

public class Dog extends Animal{
    Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog: gau gau");
    }
}
