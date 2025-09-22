package ss11_stack_queue.bai_tap.palindrome;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> emptyStack = new Stack<>();
        Queue<String> emptyQueue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.replaceAll(" ", "").split("");
        for (int i = 0; i < strArr.length; i++) {
            emptyStack.push(strArr[i]);
        }
        for (int i = 0; i < strArr.length; i++) {
            emptyQueue.add(strArr[i]);
        }
        boolean check = false;
        for (int i = 0; i < emptyStack.size(); i++) {
            if (emptyStack.peek().equals(emptyQueue.peek())) {
                check = true;
            }else check =false;
        }
        if (check){
            System.out.println("is palindrome");
        }else System.out.println("isn't palindrome");
    }
}
