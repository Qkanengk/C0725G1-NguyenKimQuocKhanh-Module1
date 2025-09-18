package bai_tap_them.bai_tap_ChatGPT.quan_ly_hoc_phan;

public abstract class Course {
    protected String courseName;
    protected int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }
    public String getCourseName(){
        return courseName;
    }

    public int getCredits(){
        return credits;
    }
}
