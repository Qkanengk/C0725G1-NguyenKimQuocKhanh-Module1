package ss13_search_algorithm.bai_tap.chuoi_tang_dan;

import java.util.Scanner;

public class BinarySearch {
     public static String increaseSubString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.charAt(0));
        for (int i = 1; i < string.length(); i ++) {
            if (string.charAt(i) > stringBuilder.charAt(stringBuilder.length() - 1)) {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = scanner.nextLine();
        System.out.println(increaseSubString(s));
    }
}
