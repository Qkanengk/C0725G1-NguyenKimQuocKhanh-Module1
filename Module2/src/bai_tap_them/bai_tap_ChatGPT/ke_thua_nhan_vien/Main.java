package bai_tap_them.bai_tap_ChatGPT.ke_thua_nhan_vien;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Nam",10000);
        employees[1] = new Manager("Hoa",100000,10000);
        employees[2]= new Employee();
        for(Employee employee:employees){
            System.out.println(employee.getSalary());
        }
    }
}
