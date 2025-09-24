package ss15_debug_exception.thuc_hanh.NumberFormatException;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        try {
            cal(x, y);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }

    public static void cal(int x, int y) throws NumberFormatException {
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        System.out.println("x + y = " + a);
        System.out.println("x - y = " + b);
        System.out.println("x * y = " + c);
        System.out.println("x / y = " + d);

    }
}
