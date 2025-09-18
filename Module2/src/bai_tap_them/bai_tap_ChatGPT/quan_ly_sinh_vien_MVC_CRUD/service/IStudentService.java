package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;

public interface IStudentService {
    public void add(Student student);
    public void edit(int id, Student student);
    public void delete(int id);
    public void find(int id);
}
