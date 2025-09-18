package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.controller;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service.CourseService;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service.ICourseService;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.view.CourseView;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.view.StudentView;

import java.util.Scanner;

public class CourseController {
    static ICourseService courseManager = new CourseService();

    static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=====MENU QUẢN LÝ HỌC PHẦN=====\n" +
                    "1. Thêm học phần\n" +
                    "2. Sửa thông tin học phần\n" +
                    "3. Xoá học phần\n" +
                    "4. Tìm kiếm học phần\n" +
                    "5. Hiển thị danh sách học phần\n" +
                    "6. Quay lại menu chính");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("=====THÊM HỌC PHẦN=====");
                    add();
                    break;
                case 2:
                    System.out.println("=====SỬA THÔNG TIN HỌC PHẦN=====");
                    edit();
                    break;
                case 3:
                    System.out.println("=====XÓA HỌC PHẦN=====");
                    delete();
                    break;
                case 4:
                    System.out.println("=====TÌM KIẾM HỌC PHẦN=====");
                    find();
                    break;
                case 5:
                    System.out.println("=====HIỂN THỊ DANH SÁCH HỌC PHẦN=====");
            }
        } while (choice != 4);
    }

    static void add() {
        courseManager.add(CourseView.inputData());
    }

    static void delete() {
        courseManager.delete(CourseView.inputId());
    }

    static void edit() {
        courseManager.edit(CourseView.inputId(), CourseView.inputData());
    }

    static void find() {
        courseManager.find(CourseView.inputId());
    }
}
