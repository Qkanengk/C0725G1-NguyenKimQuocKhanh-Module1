package bai_tap_them.quan_ly_nhan_su_cong_ty.entity;

public class Officer extends Employee {
    private String workDays;
    private String salaryCoefficient;

    public Officer(String id, String name, String dateOfBirth, String phoneNumber, String workDays, String salaryCoefficient) {
        super(id, name, dateOfBirth, phoneNumber);
        this.workDays = workDays;
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getWorkDays() {
        return workDays;
    }

    public void setWorkDays(String workDays) {
        this.workDays = workDays;
    }

    public String getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(String salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getInfo() {
        return super.getInfo() + "," + workDays + "," + salaryCoefficient;
    }

    @Override
    public String toString() {
        return super.toString() + "Officer{" +
                "workDays='" + workDays + '\'' +
                ", salaryCoefficient='" + salaryCoefficient + '\'' +
                '}';
    }
}
