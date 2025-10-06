package bai_tap_them.bai_tap_ChatGPT.DSA.Set.tim_cac_ki_tu_khac_nhau_trong_chuoi;

import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        String s = "programming";
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        for (Character character : characters) {
            System.out.println(character);
        }
    }
}
