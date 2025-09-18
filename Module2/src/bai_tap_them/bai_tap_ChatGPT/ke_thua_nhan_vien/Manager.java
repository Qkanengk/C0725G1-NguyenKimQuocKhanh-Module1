package bai_tap_them.bai_tap_ChatGPT.ke_thua_nhan_vien;

public class Manager extends Employee{
    private double bonus = 0.0f;

    public Manager() {

    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary()+getBonus();
    }
}
