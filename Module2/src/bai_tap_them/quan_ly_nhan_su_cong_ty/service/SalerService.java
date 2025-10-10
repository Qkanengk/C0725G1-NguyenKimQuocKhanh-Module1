package bai_tap_them.quan_ly_nhan_su_cong_ty.service;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Saler;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.ISalerRepository;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.SalerRepository;

import java.util.List;

public class SalerService implements ISalerService{
    private static ISalerRepository salerRepository = new SalerRepository();
    @Override
    public boolean add(Employee employee) {
        return salerRepository.add(employee);
    }

    @Override
    public List<Saler> findAll() {
        return salerRepository.findAll();
    }

    @Override
    public boolean remove(String id) {
        return salerRepository.remove(id);
    }

    @Override
    public List<Saler> findByName(String name) {
        return salerRepository.findByName(name);
    }
}
