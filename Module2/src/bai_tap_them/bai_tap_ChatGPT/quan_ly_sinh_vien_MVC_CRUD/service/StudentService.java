package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Student;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository.IStudentRepository;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository.StudentRepository;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        studentRepository.edit(id, student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

    @Override
    public void find(int id) {
        studentRepository.find(id);

    }
}
