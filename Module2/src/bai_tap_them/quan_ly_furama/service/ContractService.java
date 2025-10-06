package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Contract;
import bai_tap_them.quan_ly_furama.repository.ContractRepository;
import bai_tap_them.quan_ly_furama.repository.IContractRepository;

import java.util.List;

public class ContractService implements IContractService {
    IContractRepository contractRepository = new ContractRepository();

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public boolean add(Contract contract) {
        return contractRepository.add(contract);
    }

    @Override
    public void update(String id, Contract contract) {
        contractRepository.update(id, contract);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Contract findById(String id) {
        return null;
    }
}
