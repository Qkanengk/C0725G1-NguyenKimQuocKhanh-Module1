package map_set_tree.bai_tap.quan_ly_san_phan.service;

import map_set_tree.bai_tap.quan_ly_san_phan.entity.Product;
import map_set_tree.bai_tap.quan_ly_san_phan.repository.IProductRepository;
import map_set_tree.bai_tap.quan_ly_san_phan.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private static IProductRepository productRepository = new ProductRepository();

    @Override
    public void add(Product product) {
        productRepository.add(product);
        System.out.println("Done!");
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
        System.out.println("Done!");
    }

    @Override
    public void edit(int id, String name, double price) {
        productRepository.edit(id, name, price);
    }

    @Override
    public List find(String name) {
        return productRepository.find(name);
    }

    @Override
    public String showListPriceDecrease() {
        return productRepository.showListPriceDecrease();
    }
}
