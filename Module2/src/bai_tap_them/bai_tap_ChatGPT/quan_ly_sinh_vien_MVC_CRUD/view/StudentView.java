package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.view;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;

import java.util.Scanner;

public class StudentView {

    public static Student inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, age);
        return student;
    }

    public static int inputId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
}
