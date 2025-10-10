package bai_tap_them.quan_ly_nhan_su_cong_ty.repository;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;

import java.util.List;

public interface IEmployeeRepository<T> {
    boolean add(Employee employee);

    List<T> findAll();
    boolean remove(String id);

    List<T> findByName(String name);
}
