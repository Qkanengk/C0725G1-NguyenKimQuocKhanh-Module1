package ss13_search_algorithm.bai_tap.chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(StringSearch.stringSearch(s));
    }
}
