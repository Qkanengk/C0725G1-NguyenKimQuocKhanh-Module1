package ss5_static_access_modifier.thuc_hanh.th1;

public class Main {
    public static void main(String[] args) {
        Student student1 =new Student(111,"Khanh");
        Student student2 = new Student(222,"Nam");
        student2.display();
        student1.display();
        student1.changeCollege("CodeGym");
        student1.display();
        student2.display();
    }
}
