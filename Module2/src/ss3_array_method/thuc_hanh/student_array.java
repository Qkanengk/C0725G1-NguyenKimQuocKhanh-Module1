package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class student_array {
    public static void main(String[] args) {

        String[] students = {"Khanh", "Nam", "Viet", "Lam"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can tim (in hoa)");
        String str = new String(scanner.nextLine());
        boolean isExist=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(str)) {
                System.out.println("Da tim thay ten sinh vien tai index " + i +" cua mang");
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Khong tim thay sinh vien");
        }


    }
}
