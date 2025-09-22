package ss11_stack_queue.bai_tap.reverseIntegerStack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> integerArrayList = new ArrayList<>(n);
        ArrayList<Integer> newIntegerArrayList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Input value at index: " + i);
            integerArrayList.add(i, Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < n; i++) {
            integerStack.push(integerArrayList.get(i));
        }

        for (int i = 0; i < n; i++) {
            newIntegerArrayList.add(integerStack.pop());
        }

        for(Integer integer:newIntegerArrayList){
            System.out.println(integer);
        }
    }
}
