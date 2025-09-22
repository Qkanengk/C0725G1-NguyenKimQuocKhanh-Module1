package bai_tap_them.quan_ly_furama.entity.Person;

public class Employee extends Person {
    private String employeeEducation;
    private String employeePosition;
    private double employeeSalary;

    public Employee(String code, String name, String dateOfBirth, String sex, String idNumber, String phoneNumber, String email, String employeeEducation, String employeePosition, double employeeSalary) {
        super(code, name, dateOfBirth, sex, idNumber, phoneNumber, email);
        this.employeeEducation = employeeEducation;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeEducation() {
        return employeeEducation;
    }

    public void setEmployeeEducation(String employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeCode: " + super.getCode() +
                "EmployeeName: " + super.getName() +
                "EmployeeDateOfBirth: " + super.getDateOfBirth() +
                "EmployeeSex: " + super.getSex() +
                "EmployeeIdNumber: " + super.getIdNumber() +
                "EmployeeEmail: " + super.getEmail() +
                "EmployeeEdu: " + employeeEducation +
                "EmployeePosition: " + employeePosition +
                "EmployeeSalary: " + employeeSalary + "}";
    }


}
