package ss3_array_method.bai_tap;

import java.util.Scanner;

public class add_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n;
        do {
            System.out.println("Nhap do dai cua mang");
            n = Byte.parseByte(scanner.nextLine());
            if (n > 20) {
                System.out.println("Vui long nhap mang be hon 20");
            }
        } while (n > 20);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri tai index " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhap gia tri can them");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap index cua gia tri");
        int add_index = Integer.parseInt(scanner.nextLine());
        int[] newArr = new int[n+1];
        if(add_index<0||add_index>=n){
            System.out.println("Index khong nam trong mang");
        }else {
            for (int i = 0;i<add_index;i++){
                newArr[i]= arr[i];
            }
            for (int i=add_index+1;i<newArr.length;i++){
                newArr[i]=arr[i-1];
            }
            newArr[add_index]=x;
        }
        for (int i = 0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }


    }
}
