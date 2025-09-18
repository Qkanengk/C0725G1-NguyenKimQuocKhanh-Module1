package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.controller;

import java.util.Scanner;

public class AppController {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN VÀ KHÓA HỌC=====\n" +
                    "1. Quản lý sinh viên\n" +
                    "2. Quản lý khóa học\n" +
                    "3. Đăng kí khóa học\n" +
                    "4.Thoát chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentController.showMenu();
                    break;
                case 2:
                    CourseController.showMenu();
                    break;
                case 3:
            }
        } while (choice != 4);
    }
}
