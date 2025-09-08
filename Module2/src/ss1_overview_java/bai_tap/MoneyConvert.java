package ss1_overview_java.bai_tap;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien usd");
        double usd = sc.nextDouble();
        double vnd = usd * 26000;
        System.out.println(usd + "USD = " + vnd + "VND");
    }
}
