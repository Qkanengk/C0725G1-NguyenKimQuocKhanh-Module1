package ss3_array_method.bai_tap;

import java.util.Scanner;

public class find_max_2d_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong cua ma tran");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot cua ma tran");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr2D = new int[row][col];
        int max = arr2D[0][0];

        for (int i = 0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Nhap gia tri tai vi tri"+i+"|"+j);
                arr2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0;i<row;i++){
            for (int j=0;j<col;j++){
                if(max<arr2D[i][j]){
                    max = arr2D[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran: "+max);
    }
}
