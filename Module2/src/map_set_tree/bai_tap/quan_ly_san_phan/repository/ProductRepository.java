package map_set_tree.bai_tap.quan_ly_san_phan.repository;

import map_set_tree.bai_tap.quan_ly_san_phan.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productsList = new ArrayList<>();

    static {
        productsList.add(new Product(1, "Apple", 200));
        productsList.add(new Product(5, "Apple", 222));
        productsList.add(new Product(2, "Orange", 20));
        productsList.add(new Product(3, "Grapes", 100));
    }

    @Override
    public void add(Product product) {
        productsList.add(product);
    }

    @Override
    public void delete(int id) {
        productsList.removeIf(product -> product.getProductId() == id);
    }

    @Override
    public void edit(int id, String name, double price) {
        for (Product product : productsList) {
            if (product.getProductId() == id) {
                product.setProductName(name);
                product.setPrice(price);
            }
        }
    }

    @Override
    public List<Product> find(String name) {
        List<Product> foundList = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getProductName().equals(name)) {
                foundList.add(product);
            }
        }
        return foundList;
    }

    @Override
    public String showListPriceDecrease() {
        Collections.sort(productsList);
        String list = "===========\n";
        for (Product product : productsList) {
            list += product.toString() + "\n";
        }
        return list;
    }
    public String showListPriceIncrease(){
        return "";
    }
}
