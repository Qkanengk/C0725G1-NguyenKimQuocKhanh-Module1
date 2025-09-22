package ss11_stack_queue.bai_tap.he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> emptyStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a decimal number");
        int decimal = Integer.parseInt(scanner.nextLine());
        int temp = 1;
        int binary;
        while (temp != 0) {
            temp = decimal / 2;
            binary = decimal % 2;
            decimal = temp;
            emptyStack.push(binary);
        }
        Integer[] result = new Integer[emptyStack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] =  (emptyStack.pop());
        }
        for (Integer num:result){
            System.out.print(num);
        }
    }
}
