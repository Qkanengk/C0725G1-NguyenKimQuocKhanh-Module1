package ss1_overview_java.bai_tap;

import java.util.Scanner;

public class PrintGreeting {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = new String(sc.next());
        System.out.println("Hello "+ name);

    }
}
