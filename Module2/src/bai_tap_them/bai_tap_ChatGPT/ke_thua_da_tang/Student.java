package bai_tap_them.bai_tap_ChatGPT.ke_thua_da_tang;

public class Student extends Person {
    private String studentId = "";

    public Student() {

    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
