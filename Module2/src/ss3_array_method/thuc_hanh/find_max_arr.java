package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class find_max_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap do dai danh sach");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 20) {
                System.out.println("Vui long nhap do dai be hon 20");
            }
        } while (n > 20);

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri tai san cua ti phu thu " + (i + 1));
            arr[i] = Double.parseDouble(scanner.nextLine());
        }

        double max = 0;
        for(int i = 0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Gia tri lon nhat trong danh sach la: "+max);
    }
}
