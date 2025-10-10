package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Person.Customer;

import java.util.List;

public interface IPromotionRepository extends Repository<Customer>{
    public List<Customer> findAllByYear(int year);
}
