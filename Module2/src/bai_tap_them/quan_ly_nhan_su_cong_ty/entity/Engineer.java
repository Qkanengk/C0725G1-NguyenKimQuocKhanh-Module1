package bai_tap_them.quan_ly_nhan_su_cong_ty.entity;

public class Engineer extends Employee {
    private String major;
    private String level;

    public Engineer(String id, String name, String dateOfBirth, String phoneNumber, String major, String level) {
        super(id, name, dateOfBirth, phoneNumber);
        this.major = major;
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInfo() {
        return super.getInfo() + "," + major + "," + level;
    }

    @Override
    public String toString() {
        return super.toString() + "Engineer{" +
                "major='" + major + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
