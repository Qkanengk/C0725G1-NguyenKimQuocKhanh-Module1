package ss3_array_method.bai_tap;

import java.util.Scanner;

public class so_lan_xuat_hien_ki_tu_trong_chuoi {
    public static void main(String[] args) {
        String str = "Hello";
        Scanner scanner = new Scanner(System.in);
        char check = 'l';
        int count = 0;
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)==check){
                count++;
            }
        }
        System.out.println(count);
    }
}
