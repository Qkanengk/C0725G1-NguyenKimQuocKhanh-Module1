package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.view;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Course;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;

import java.util.Scanner;

public class CourseView {
    public static Course inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id học phần");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên học phần");
        String name = scanner.nextLine();
        System.out.println("Nhập số tín chỉ");
        int credits = Integer.parseInt(scanner.nextLine());
        Course course = new Course(id, name, credits);
        return course;
    }

    public static int inputId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id học phần");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
}
