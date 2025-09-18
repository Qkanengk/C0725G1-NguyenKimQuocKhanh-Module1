package bai_tap_them.bai_tap_ChatGPT.quan_ly_hoc_phan;

public class OnlineCourse extends Course implements Gradable {
    private double grade;

    public OnlineCourse(String courseName, int credits, double grade) {
        super(courseName, credits);
        this.grade = grade;
    }

    @Override
    public double getGrade() {
        return grade;
    }
}
