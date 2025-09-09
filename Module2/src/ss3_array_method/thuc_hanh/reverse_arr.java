package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class reverse_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap do dai mang ");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 20) {
                System.out.println("Vui long nhap do dai < 20");
            }
        } while (n > 20);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri tai index "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int last = arr.length-1;
        int[] reversedArr = new int[n];
        for (int i = 0;i<n;i++){
            reversedArr[i] = arr[last];
            last--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i]+"\t");

        }


    }
}
