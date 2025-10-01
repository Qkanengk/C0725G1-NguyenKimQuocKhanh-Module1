package bai_tap_them.quan_ly_furama.service;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.repository.EmployeeRepository;
import bai_tap_them.quan_ly_furama.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean add(Employee employee) {
       return employeeRepository.add(employee);
    }

    @Override
    public void update(String id, Employee employee) {
        employeeRepository.update(id, employee);
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee findById(String id) {
        return null;
    }
}
