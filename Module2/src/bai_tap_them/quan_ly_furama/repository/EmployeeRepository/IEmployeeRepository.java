package bai_tap_them.quan_ly_furama.repository.EmployeeRepository;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;

public interface IEmployeeRepository {
    void addEmployee(Employee employee);

    void editEmployee(
            String employeeCode,
            String employeeName,
            String dateOfBirth,
            String employeeSex,
            String employeeIdNumber,
            String employeePhoneNumber,
            String employeeEmail,
            String employeeEducation,
            String employeePosition,
            double employeeSalary);

    public String displayList();
}
