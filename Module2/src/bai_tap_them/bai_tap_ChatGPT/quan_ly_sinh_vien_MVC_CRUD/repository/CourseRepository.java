package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Course;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;

public class CourseRepository implements ICourseRepository {
    static Course[] courses = new Course[10];

    static {
        courses[0] = new Course(111, "Toan", 3);
        courses[1] = new Course(123, "Mac Le-nin", 2);
    }


    @Override
    public void add(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                break;
            }
        }
    }

    @Override
    public void edit(int id, Course student) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getId() == id) {
                courses[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getId() == id) {
                courses[i] = null;
                break;
            }
        }

    }

    @Override
    public void find(int id) {
        Course course = null;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getId() == id) {
                course = courses[i];
                break;
            }
        }
        System.out.println("==========\nID: " + course.getId() + "\nHỌC PHẦN: " + course.getName() + "\nTÍN CHỈ: " + course.getCredits());
    }
}
