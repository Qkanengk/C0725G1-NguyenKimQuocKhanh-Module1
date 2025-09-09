package ss3_array_method.thuc_hanh;

import java.util.Scanner;
import java.util.SortedMap;

public class count_passed_students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so luong sinh vien trong danh sach");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 30) {
                System.out.println("Vui long nhap so luong sinh vien <30");
            }
        } while (n > 30);
        double[] students = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap diem cua sinh vien " + (i + 1));
            students[i] = Double.parseDouble(scanner.nextLine());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (students[i] >= 5 && students[i] <= 10) {
                count++;
            }
        }
        System.out.println("Danh sach diem cua sinh vien");
        for (int i = 0;i<n;i++){
            System.out.print(students[i]+"\t");
        }
        System.out.println("\nSo luong sinh vien thi do la: "+count);
    }
}
