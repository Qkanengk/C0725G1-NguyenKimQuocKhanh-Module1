package bai_tap_them.bai_tap_ChatGPT.DSA.Set.Nhap_danh_sach_so_nguyen_xoa_phan_tu_trung_lap;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(1);
        for (Integer integer: integerSet){
            System.out.println(integer);
        }
    }
}



