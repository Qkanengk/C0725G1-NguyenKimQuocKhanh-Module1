package bai_tap_them.quan_ly_nhan_su_cong_ty.service;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Engineer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.EngineerRepository;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.IEngineerRepository;

import java.util.List;

public class EngineerService implements IEngineerService{
    private static IEngineerRepository engineerRepository = new EngineerRepository();
    @Override
    public boolean add(Employee employee) {
        return engineerRepository.add(employee);
    }

    @Override
    public List<Engineer> findAll() {
        return engineerRepository.findAll();
    }

    @Override
    public boolean remove(String id) {
        return engineerRepository.remove(id);
    }

    @Override
    public List<Engineer> findByName(String name) {
        return engineerRepository.findByName(name);
    }
}
