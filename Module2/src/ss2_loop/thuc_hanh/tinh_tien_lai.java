package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien cho vay");
        double tienChoVay = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap lai moi thang (%)");
        double laiSuat = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so thang cho vay");
        int thang = Integer.parseInt(sc.nextLine());
        double soTienLai = 0;
        for (int i = 1;i<=thang;i++){
            soTienLai += tienChoVay *(laiSuat/100)/12*thang;
        }
        System.out.println("Tong so tien lai la: "+soTienLai);

    }
}
