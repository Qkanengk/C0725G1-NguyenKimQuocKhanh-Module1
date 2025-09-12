package ss5_static_access_modifier.bai_tap.b2_lop_chi_ghi;

public class Student {
    private String name;
    private String classes;

    Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
