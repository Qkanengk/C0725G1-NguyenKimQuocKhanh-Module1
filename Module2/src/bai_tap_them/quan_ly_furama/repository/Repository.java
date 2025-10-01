package bai_tap_them.quan_ly_furama.repository;

import java.util.List;

public interface Repository <T> {

    List<T> findAll();
    boolean add(T t);

    void update(String id, T t);
    void delete(String id);

    T findById(String id);
}
