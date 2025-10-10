package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;

import java.util.List;

public interface IPromotionService extends Service<Customer>{
    public List<Customer> findAllByYear(int year);
}
