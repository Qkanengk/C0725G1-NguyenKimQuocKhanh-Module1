package ss5_static_access_modifier.bai_tap.b2_lop_chi_ghi;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Khanh");
        student1.setClasses("Module 2");

        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
