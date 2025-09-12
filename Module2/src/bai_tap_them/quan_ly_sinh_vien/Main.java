package bai_tap_them.quan_ly_sinh_vien;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void showMenu() {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("===StudentManager===\n" +
                    "1.Show Students\n" +
                    "2.Add Student\n" +
                    "3.Quit\n" +
                    "===Input your choice===");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("===StudentList===");
                    manager.showList();
                    break;
                case 2:
                    System.out.println("===Input an id===");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("===Input an name===");
                    String name = scanner.nextLine();
                    manager.addStudent(id,name);
                    break;
            }

        } while (choice != 3);
    }

    public static void main(String[] args) {
        showMenu();
        ;
    }
}
