package ss11_stack_queue.bai_tap.reverseStringStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String");
        String str = scanner.nextLine();

        String[] stringArr = str.replaceAll(" ", "").split("");
        String[] result  = new  String[stringArr.length];
        for (int i = 0;i< stringArr.length;i++){
            wStack.push(stringArr[i]);
        }
        for (int i = 0; i <stringArr.length ; i++) {
            result[i] = wStack.pop();
        }
        for (String mWord:result){
            System.out.print(mWord);
        }

    }
}
