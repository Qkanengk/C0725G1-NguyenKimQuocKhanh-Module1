package bai_tap_them.bai_tap_ChatGPT.ke_thua_animal;

public class Cat extends Animal{

    Cat(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Cat: meo meo");
    }
}
