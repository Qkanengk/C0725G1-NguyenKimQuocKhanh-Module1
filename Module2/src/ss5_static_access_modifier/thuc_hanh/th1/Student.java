package ss5_static_access_modifier.thuc_hanh.th1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeCollege(String college){
       this.college = college;
    }
    public void display(){
        System.out.println("Name: "+name+" rollno: "+rollno+" college: "+college );
    }
}
