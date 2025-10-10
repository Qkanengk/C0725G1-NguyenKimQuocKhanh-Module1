package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;
import bai_tap_them.quan_ly_furama.repository.IPromotionRepository;
import bai_tap_them.quan_ly_furama.repository.PromotionRepository;

import java.util.List;

public class PromotionService implements IPromotionService {
    private static IPromotionRepository promotionRepository = new PromotionRepository();

    @Override
    public List<Customer> findAll() {
        return promotionRepository.findAll();
    }

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public void update(String id, Customer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    public List<Customer> findAllByYear(int year) {
        return promotionRepository.findAllByYear(year);
    }
}
