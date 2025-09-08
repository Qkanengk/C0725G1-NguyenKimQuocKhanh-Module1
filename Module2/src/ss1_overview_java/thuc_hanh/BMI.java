package ss1_overview_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ban:");
        double chieuCao = sc.nextFloat();
        System.out.println("Nhap can nang cua ban:");
        double canNang = sc.nextFloat();
        double bmi = canNang / (Math.pow(chieuCao, 2));
        if (bmi >= 30) {
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18) {
            System.out.println("Normal");
        } else System.out.println("Underweight");
    }
}
