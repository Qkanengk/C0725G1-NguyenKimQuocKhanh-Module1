package bai_tap_them.quan_ly_do_dien_tu.service;

import java.util.List;

public interface IProductService <T>{
    boolean add(T product);
    List<T> findAll();
    boolean remove(String id);
    List<T>findByName(String name);
}
