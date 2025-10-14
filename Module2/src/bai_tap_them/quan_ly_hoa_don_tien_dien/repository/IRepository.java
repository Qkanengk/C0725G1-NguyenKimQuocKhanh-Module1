package bai_tap_them.quan_ly_hoa_don_tien_dien.repository;

import java.util.List;

public interface IRepository<T> {
    boolean add(T t);

    List<T> findAll();
}
