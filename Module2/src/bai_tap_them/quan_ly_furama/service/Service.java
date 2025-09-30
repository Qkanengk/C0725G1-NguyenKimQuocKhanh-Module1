package bai_tap_them.quan_ly_furama.service;

import java.util.List;

public interface Service<T> {
    List<T> findAll();

    void add(T t);

    void update(String id, T t);

    void delete(String id);

    T findById(String id);
}
