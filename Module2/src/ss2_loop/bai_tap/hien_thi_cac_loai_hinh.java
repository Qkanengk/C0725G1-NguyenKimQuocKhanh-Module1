package ss2_loop.bai_tap;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Nhap lua chon-----\n" +
                    "1.Hinh chu nhat\n" + "2.Hinh tam giac vuong ben trai\n" +
                    "3.Hinh tam giac vuong ben tren ben trai\n" +
                    "4.Hinh tam giac can\n" +
                    "5.Thoat");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {

                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {

                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    for (int i = 5; i >= 0; i--) {

                        for (int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }

                    break;
                case 4:
                    for (int k = 0; k < 5; k++) {
                        for (int i = 0; i < 5 - k; i++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * k - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }


                    break;
                case 5:

                    break;
            }
        } while (choice != 5);
    }
}
