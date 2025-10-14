package bai_tap_them.quan_ly_do_dien_tu.service;

import bai_tap_them.quan_ly_do_dien_tu.entity.Phone;
import bai_tap_them.quan_ly_do_dien_tu.repository.IPhoneRepository;
import bai_tap_them.quan_ly_do_dien_tu.repository.PhoneRepository;

import java.util.List;

public class PhoneService implements IPhoneService{
    private static final IPhoneRepository phoneRepository = new PhoneRepository();
    @Override
    public boolean add(Phone product) {
        return phoneRepository.add(product);
    }

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public boolean remove(String id) {
        return phoneRepository.remove(id);
    }

    @Override
    public List<Phone> findByName(String name) {
        return phoneRepository.findByName(name);
    }
}
