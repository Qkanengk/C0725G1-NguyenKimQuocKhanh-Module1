package ss15_debug_exception.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] integers = new Integer[100];
        System.out.println("-----List of integers-----");
        for (int i = 0; i < 100; i++) {
            integers[i] = random.nextInt(100);
            System.out.println(integers[i] + " ");
        }
        return integers;
    }
}
