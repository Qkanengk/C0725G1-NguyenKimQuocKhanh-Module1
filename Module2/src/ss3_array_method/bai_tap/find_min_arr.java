package ss3_array_method.bai_tap;

import java.util.Scanner;

public class find_min_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Nhap gia tri tai index "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: "+min);

    }
}
