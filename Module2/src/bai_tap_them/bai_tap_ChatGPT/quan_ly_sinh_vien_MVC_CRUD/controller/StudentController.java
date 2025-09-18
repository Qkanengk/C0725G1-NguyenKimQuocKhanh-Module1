package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.controller;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service.IStudentService;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service.StudentService;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.view.StudentView;

import java.util.Scanner;

public class StudentController {
    static IStudentService studentManager = new StudentService();

    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====MENU QUẢN LÝ SINH VIÊN=====\n" +
                    "1. Thêm sinh viên\n" +
                    "2. Sửa thông tin sinh viên\n" +
                    "3. Xoá sinh viên\n" +
                    "4. Tìm kiếm sinh viên\n" +
                    "5. Hiển thị danh sách sinh viên\n" +
                    "6. Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("=====THÊM SINH VIÊN=====");
                    add();
                    break;
                case 2:
                    System.out.println("=====SỬA SINH VIÊN=====");
                    edit();
                    break;
                case 3:
                    System.out.println("=====XÓA SINH VIÊN=====");
                    delete();
                    break;
                case 4:
                    System.out.println("=====TÌM KIẾM SINH VIÊN=====");
                    find();
                    break;
                case 5:
                    System.out.println("=====HIỂN THỊ DANH SÁCH SINH VIÊN=====");
            }
        } while (choice != 4);
    }

    static void add() {
        studentManager.add(StudentView.inputData());
    }

    static void delete() {
        studentManager.delete(StudentView.inputId());
    }

    static void edit() {
        studentManager.edit(StudentView.inputId(), StudentView.inputData());
    }
    static void find(){
        studentManager.find(StudentView.inputId());
    }
}
