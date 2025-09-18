package bai_tap_them.bai_tap_ChatGPT.quan_ly_hoc_phan;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        Course[] courses = new Course[4];
        courses[0] = new OnlineCourse("Java", 100000, 10);
        courses[1] = new OfflineCourse("Java", 100000, 10, "202");
        courses[2] = new OfflineCourse("Python", 100000, 10, "102");
        courses[3] = new OfflineCourse("C++", 100000, 10, "201");
        for (Course course:courses){
            if (course instanceof Gradable){
                sum += ((Gradable) course).getGrade();
                count++;
            }
            if (course instanceof Attendant){
                System.out.println(course.getCourseName());
                ((Attendant) course).attendClass();
            }
        }

    }
}
