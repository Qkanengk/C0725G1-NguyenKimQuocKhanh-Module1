package bai_tap_them.quan_ly_furama.service.EmployeeService;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.repository.EmployeeRepository.EmployeeRepository;
import bai_tap_them.quan_ly_furama.repository.EmployeeRepository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void editEmployee(
            String employeeCode,
            String employeeName,
            String dateOfBirth,
            String employeeSex,
            String employeeIdNumber,
            String employeePhoneNumber,
            String employeeEmail,
            String employeeEducation,
            String employeePosition,
            double employeeSalary) {
        employeeRepository.editEmployee(
                employeeCode,
                employeeName,
                dateOfBirth,
                employeeSex,
                employeeIdNumber,
                employeePhoneNumber,
                employeeEmail,
                employeeEducation,
                employeePosition,
                employeeSalary);
    }

    @Override
    public String displayList() {
        return employeeRepository.displayList();
    }
}
