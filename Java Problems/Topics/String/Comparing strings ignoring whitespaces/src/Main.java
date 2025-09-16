import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String result1 = str1.trim().replaceAll(" ","");
        String result2 = str2.trim().replaceAll(" ","");
        if (result1.equals(result2)){
            System.out.println("true");
        }else System.out.println("false");
    }
}