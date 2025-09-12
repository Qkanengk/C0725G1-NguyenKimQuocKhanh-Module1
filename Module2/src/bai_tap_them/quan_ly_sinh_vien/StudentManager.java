package bai_tap_them.quan_ly_sinh_vien;

public class StudentManager {
    public static Student[] students = new Student[50];

    public void showList() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("ID: " + students[i].getId() + "\nStudent name: " + students[i].getName());
            } else break;
        }

    }

    public void addStudent(int id, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null && isExist(id) == false) {
                students[i] = new Student(id, name);
                break;
            }else {
                System.out.println("ID is existed");
                break;
            }
        }
    }

    public boolean isExist(int id) {
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                check = true;
                break;
            }
        }
        if (check) {
            return true;
        } else return false;
    }
}
