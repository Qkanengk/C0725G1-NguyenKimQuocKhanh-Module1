package bai_tap_them.quan_ly_furama.repository;

import bai_tap_them.quan_ly_furama.entity.Person.Employee;
import bai_tap_them.quan_ly_furama.utils.ReadAndWriteData;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static final File filepath = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/bai_tap_them/quan_ly_furama/data/EMPLOYEE_DATA.csv");


    @Override
    public List<Employee> findAll() {
        List<String> stringList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        try {
            stringList = ReadAndWriteData.readDataFromCSV(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line : stringList) {
            String[] arr = line.split(",");
            employeeList.add(new Employee(arr[0], arr[1], LocalDate.parse(arr[2]), arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

    @Override
    public boolean add(Employee employee) {
        List<Employee> employeeList = findAll();
        if (employeeList.contains(employee)) {
            return false;
        } else {
            employeeList.add(employee);
            List<String> stringList = new ArrayList<>();
            stringList.add((employee).getInfo());
            try {
                ReadAndWriteData.writeDataToCSV(filepath, stringList, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
    }



    @Override
    public void update(String id, Employee employee) {
        List<Employee> employeeList = findAll();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.set(i, employee);
                break;
            }
        }
        for (Employee employee1 : employeeList) {
            stringList.add(employee1.getInfo());
        }
        try {
            ReadAndWriteData.writeDataToCSV(filepath, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        List<Employee> employeeList = findAll();
        List<String> stringList = new ArrayList<>();
        employeeList.removeIf(employee -> employee.getId().equals(id));
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfo());
        }
        try {
            ReadAndWriteData.writeDataToCSV(filepath, stringList, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee findById(String id) {
        return null;
    }
}
