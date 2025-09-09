package ss3_array_method.bai_tap;

import java.util.Scanner;

public class sum_duong_cheo_chinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap gia tri tai index: " + i + "|" + j);
                arr2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr2D[i][i];
        }
        System.out.println("Tong cac phan tu duong cheo chinh la: " + sum);
    }
}
