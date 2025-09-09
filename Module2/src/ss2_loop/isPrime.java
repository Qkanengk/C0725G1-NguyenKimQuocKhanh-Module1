package ss2_loop;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n + " la so nguyen to");
            } else
                System.out.println(n + " khong phai la so nguyen to");
        }
    }
}
