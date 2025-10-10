package bai_tap_them.quan_ly_nhan_su_cong_ty.service;

import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Employee;
import bai_tap_them.quan_ly_nhan_su_cong_ty.entity.Officer;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.IOfficerRepository;
import bai_tap_them.quan_ly_nhan_su_cong_ty.repository.OfficerRepository;

import java.util.List;

public class OfficerService implements IOfficerService{
    private static IOfficerRepository officerRepository = new OfficerRepository();
    @Override
    public boolean add(Employee employee) {
        return officerRepository.add(employee);
    }

    @Override
    public List<Officer> findAll() {
        return officerRepository.findAll();
    }

    @Override
    public boolean remove(String id) {
        return officerRepository.remove(id);
    }

    @Override
    public List<Officer> findByName(String name) {
        return officerRepository.findByName(name);
    }
}
