package ss1_overview_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a, b;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a");
        a = sc.nextFloat();

        System.out.println("Input b");
        b = sc.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else System.out.println("Vo nghiem");
        } else {
            if (b == 0) {
                System.out.println("x = 0");
            } else System.out.println("x = " + (-b / a));
        }

    }
}
