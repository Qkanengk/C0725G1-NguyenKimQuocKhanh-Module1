package ss3_array_method.bai_tap;

import java.util.Scanner;

public class delete_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap do dai cua mang");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 20) {
                System.out.println("Vui long nhap mang be hon 20");
            }
        } while (n > 20);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri tai index " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        boolean isExist = false;
        System.out.println("Nhap gia tri can xoa");
        int x = Integer.parseInt(scanner.nextLine());
        int del_index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                del_index = i;
                isExist = true;
            }
        }
        if (isExist) {
            for (int i = del_index; i < n - 1; i++) {
//
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = 0;
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);

            }
        }else System.out.println("Kho co gia tri trong mang");


    }
}
