package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class temperature_convert {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do{
            System.out.println("-----Menu-----\n1.Celsius to fahrenheit\n2.Fahrenheit to celsius\n0.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input celsius");
                    double celsius = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit is: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Input fahrenheit");
                    double fahrenheit = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
}
