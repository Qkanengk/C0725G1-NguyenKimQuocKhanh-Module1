package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class student_manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Nhap lua chon-----\n" + "1.Hien thi danh sach sinh vien\n" + "2.Them sinh vien\n" + "3.Xoa sinh vien\n" + "4.Sua thong tin sinh vien\n" + "5.Tim kiem sinh vien\n" + "6.Thoat");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-----Danh sach sinh vien-----");

                    break;
                case 2:
                    System.out.println("-----Them sinh vien-----");
                    System.out.println("Nhap ho ten sinh vien");

                    System.out.println("Nhap tuoi sinh vien");

                    System.out.println("Nhap dia chi sinh vien");

                    System.out.println("Da them sinh vien thanh cong");
                    break;
                case 3:
                    System.out.println("-----Xoa sinh vien-----");
                    break;
                case 4:
                    System.out.println("-----Sua thong tin sinh vien-----");
                    break;
                case 5:
                    System.out.println("-----Tim kiem sinh vien");
                    break;
            }
        } while (choice != 6);
    }
}
