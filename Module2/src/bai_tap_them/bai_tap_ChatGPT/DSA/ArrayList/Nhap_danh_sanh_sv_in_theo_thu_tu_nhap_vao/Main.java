package bai_tap_them.bai_tap_ChatGPT.DSA.ArrayList.Nhap_danh_sanh_sv_in_theo_thu_tu_nhap_vao;

import java.util.*;

public class Main  {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.Add student\n" +
                    "2.Show list\n" +
                    "3.Add with index");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age");
                    int age = Integer.parseInt(scanner.nextLine());
                    studentList.add(new Student(name, age));
                    break;
                case 2:
                    Collections.sort(studentList);
                    for (Student student : studentList) {
                        System.out.println(student.toString());
                    }
                    break;
                case 3:
                    System.out.println("Name");
                    String Name = scanner.nextLine();
                    System.out.println("Age");
                    int Age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentList.add(index, new Student(Name, Age));
                    break;
            }
        } while (choice != 0);
    }
}
