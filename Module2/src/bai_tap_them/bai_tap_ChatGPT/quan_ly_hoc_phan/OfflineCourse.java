package bai_tap_them.bai_tap_ChatGPT.quan_ly_hoc_phan;

public class OfflineCourse extends Course implements Gradable, Attendant {
    private double grade;
    private String room;

    public OfflineCourse(String courseName, int credits, double grade, String room) {
        super(courseName, credits);
        this.grade = grade;
        this.room = room;
    }

    @Override
    public void attendClass() {
        System.out.println("Attend in room " + room);
    }

    @Override
    public double getGrade() {
        return grade;
    }
}
