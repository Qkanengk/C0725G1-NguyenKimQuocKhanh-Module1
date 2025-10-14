package bai_tap_them.quan_ly_do_dien_tu.service;

import bai_tap_them.quan_ly_do_dien_tu.entity.Computer;
import bai_tap_them.quan_ly_do_dien_tu.repository.ComputerRepository;
import bai_tap_them.quan_ly_do_dien_tu.repository.IComputerRepository;

import java.util.List;

public class ComputerService implements IComputerService{
    private static final IComputerRepository computerRepository = new ComputerRepository();
    @Override
    public boolean add(Computer product) {
        return computerRepository.add(product);
    }

    @Override
    public List<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public boolean remove(String id) {
        return computerRepository.remove(id);
    }

    @Override
    public List<Computer> findByName(String name) {
        return computerRepository.findByName(name);
    }
}
