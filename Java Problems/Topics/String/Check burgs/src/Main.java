import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        if(str1.endsWith("burg")){
            System.out.println("true");
        }else System.out.println("false");
    }
}