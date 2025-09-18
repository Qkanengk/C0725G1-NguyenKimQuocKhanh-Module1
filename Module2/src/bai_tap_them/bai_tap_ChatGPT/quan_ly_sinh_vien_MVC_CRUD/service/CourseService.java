package bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.service;

import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.entity.Course;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository.CourseRepository;
import bai_tap_them.bai_tap_ChatGPT.quan_ly_sinh_vien_MVC_CRUD.repository.ICourseRepository;

public class CourseService implements ICourseService {
    private ICourseRepository courseRepository = new CourseRepository();

    @Override
    public void add(Course course) {
        courseRepository.add(course);
    }

    @Override
    public void edit(int id, Course course) {
        courseRepository.edit(id, course);
    }

    @Override
    public void delete(int id) {
        courseRepository.delete(id);
    }

    @Override
    public void find(int id) {
        courseRepository.find(id);
    }
}
