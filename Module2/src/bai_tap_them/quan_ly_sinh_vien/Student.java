package bai_tap_them.quan_ly_sinh_vien;

public class Student {
    private int id;
    private String name;
    public static int numberOfStudents;
    Student(int id, String name){
        this.id = id;
        this.name = name;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
