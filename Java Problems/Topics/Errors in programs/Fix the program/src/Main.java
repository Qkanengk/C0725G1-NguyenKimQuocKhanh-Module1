import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next(); 
        String b = scanner.next();
        String c = scanner.next();

        String result = a.concat(b.concat(c));

        System.out.println(result);
    }
}