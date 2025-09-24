package ss15_debug_exception.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chi so cua mot phan tu bat ki");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine());
            System.out.println("Gia tri cua phan tu co index " + index + " la " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
