package map_set_tree.bai_tap.quan_ly_san_phan.service;

import map_set_tree.bai_tap.quan_ly_san_phan.entity.Product;

import java.util.List;

public interface IProductService {
    public void add(Product product);
    public void delete(int id);
    public void edit(int id,String name, double price);
    public List find(String name);
    public String showListPriceDecrease();
}
