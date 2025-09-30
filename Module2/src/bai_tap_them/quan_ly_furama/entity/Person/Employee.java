package bai_tap_them.quan_ly_furama.entity.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person{
    private String qualification;
    private String position;
    private double salary;


    public Employee(String id, String name, LocalDate dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String qualification, String position, double salary) {
        super(id, name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return id + "," + name + "," + dateOfBirth + "," + gender + "," +
                identityNumber + "," + phoneNumber + "," + email + "," +
                qualification + "," + position + "," + salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
