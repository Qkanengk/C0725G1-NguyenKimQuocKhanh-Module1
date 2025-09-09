package ss3_array_method.bai_tap;

import java.util.Scanner;

public class combine_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap gia tri cho mang 1 ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap gia tri cho mang 2 ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int temp_index = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr3[temp_index] = arr2[i];
            temp_index++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + "\t");

        }
    }
}
