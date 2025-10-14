package bai_tap_them.quan_ly_do_dien_tu.repository;

import bai_tap_them.quan_ly_do_dien_tu.entity.Product;

import java.util.List;

public interface IProductRepository <T>{
    boolean add(T product);
    List<T> findAll();
    boolean remove(String id);
    List<T>findByName(String name);
}
