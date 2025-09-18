package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Course;

public interface ICourseRepository {
    public void add(Course course);

    public void edit(int id, Course course);

    public void delete(int id);

    public void find(int id);
}
