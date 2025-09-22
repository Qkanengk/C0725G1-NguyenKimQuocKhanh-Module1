package bai_tap_them.quan_ly_furama.repository.EmployeeRepository;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(
                "Vn2001",
                "Khanh",
                "30/08/2000",
                "Male",
                "049821231332",
                "0989832931",
                "khanh@gmail.com",
                "College",
                "Staff",
                2_000_000));
        employeeList.add(new Employee(
                "Vn2005",
                "Khanassh",
                "30/08/2001",
                "Male",
                "049821231332",
                "0989832931",
                "khanasdwwsah@gmail.com",
                "College",
                "Staff",
                2_000_000));
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
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
        for (Employee employee : employeeList) {
            if (employee.getCode().equals(employeeCode)) {
                employee.setName(employeeName);
                employee.setDateOfBirth(dateOfBirth);
                employee.setSex(employeeSex);
                employee.setIdNumber(employeeIdNumber);
                employee.setPhoneNumber(employeePhoneNumber);
                employee.setEmail(employeeEmail);
                employee.setEmployeeEducation(employeeEducation);
                employee.setEmployeePosition(employeePosition);
                employee.setEmployeeSalary(employeeSalary);
            }
        }
    }

    @Override
    public String displayList() {
        String list = "";
        for (Employee employee : employeeList) {
            list += "\n=====================\n" + employee.toString();
        }
        return list;
    }
}
