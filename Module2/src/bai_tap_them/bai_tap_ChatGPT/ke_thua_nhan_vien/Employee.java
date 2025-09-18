package bai_tap_them.bai_tap_ChatGPT.ke_thua_nhan_vien;

public class Employee {
    private String name = "";
    private double salary = 0.0f;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
