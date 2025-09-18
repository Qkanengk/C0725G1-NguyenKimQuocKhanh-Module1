package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;

public class StudentRepository implements IStudentRepository {
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(111, "Hoa", 18);
        students[1] = new Student(123, "Nam", 19);
    }


    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void edit(int id, Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                break;
            }
        }

    }

    @Override
    public void find(int id) {
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                student = students[i];
                break;
            }
        }
        System.out.println("==========\nID: " + student.getId() + "\nTÊN: " + student.getName() + "\nTUỔI: " + student.getAge());
    }
}
