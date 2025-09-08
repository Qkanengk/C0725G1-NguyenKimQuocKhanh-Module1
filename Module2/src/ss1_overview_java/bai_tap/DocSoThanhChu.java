package ss1_overview_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban can doc thanh chu");
        int n = sc.nextInt();
        if (n >= 0 && n <= 10) {
            switch (n) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (n > 10 && n < 20) {
            switch (n % 10) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;

            }
        } else if (n >= 20 && n < 100) {
            int tens = n / 10;
            int ones = n % 10;
            String first = new String();
            String second = new String();
            switch (tens) {
                case 2:
                    first = "Twenty";
                    break;
                case 3:
                    first = "Thirty";
                    break;
                case 4:
                    first = "Fourty";
                    break;
                case 5:
                    first = "Fifty";
                    break;
                case 6:
                    first = "Sixty";
                    break;
                case 7:
                    first = "Seventy";
                    break;
                case 8:
                    first = "Eighty";
                    break;
                case 9:
                    first = "Ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    second = " One";
                    break;
                case 2:
                    second = " Two";
                    break;
                case 3:
                    second = " Three";
                    break;
                case 4:
                    second = " Four";
                    break;
                case 5:
                    second = " Five";
                    break;
                case 6:
                    second = " Six";
                    break;
                case 7:
                    second = " Seven";
                    break;
                case 8:
                    second = " Eight";
                    break;
                case 9:
                    second = " Nine";
                    break;

            }
            System.out.println(first + second);
        } else if (n >= 100 && n < 1000) {


            int hundred = n / 100;
            int ones = n % 10;
            int tens = (n / 10) % 10;
            String first = new String();
            String second = new String();
            String last = new String();
            switch (hundred) {
                case 1:
                    first = "One hundred";
                    break;
                case 2:
                    first = "Two hundred";
                    break;
                case 3:
                    first = "Three hundred";
                    break;
                case 4:
                    first = "Four hundred";
                    break;
                case 5:
                    first = "Five hundred";
                    break;
                case 6:
                    first = "Six hundred";
                    break;
                case 7:
                    first = "Seven hundred";
                    break;
                case 8:
                    first = "Eight hundred";
                    break;
                case 9:
                    first = "Nine hundred";
                    break;
            }
            switch (tens) {
                case 2:
                    second = "and Twenty";
                    break;
                case 3:
                    second = "and Thirty";
                    break;
                case 4:
                    second = "and Fourty";
                    break;
                case 5:
                    second = "and Fifty";
                    break;
                case 6:
                    second = "and Sixty";
                    break;
                case 7:
                    second = "and Seventy";
                    break;
                case 8:
                    second = "and Eighty";
                    break;
                case 9:
                    second = "and Ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    last = " One";
                    break;
                case 2:
                    last = " Two";
                    break;
                case 3:
                    last = " Three";
                    break;
                case 4:
                    last = " Four";
                    break;
                case 5:
                    last = " Five";
                    break;
                case 6:
                    last = " Six";
                    break;
                case 7:
                    last = " Seven";
                    break;
                case 8:
                    last = " Eight";
                    break;
                case 9:
                    last = " Nine";
                    break;

            }
            System.out.println(first + second + last);
        } else System.out.println("Out of ability");
    }
}
