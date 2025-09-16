import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        String number = scanner.nextLine();
        String[] index = number.split(" ");
        String result = str.substring(Integer.parseInt(index[0]),Integer.parseInt(index[1])+1);
        System.out.println(result);

    }
}