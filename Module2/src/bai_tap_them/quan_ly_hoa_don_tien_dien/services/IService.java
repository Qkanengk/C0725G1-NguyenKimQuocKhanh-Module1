package bai_tap_them.quan_ly_hoa_don_tien_dien.services;

import java.util.List;

public interface IService<T> {
    boolean add(T t);

    List<T> findAll();
}
