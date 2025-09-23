package map_set_tree.thuc_hanh.map.danh_sach_sv_theo_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentList = new HashMap<>();
        studentList.put("Khanh", 20);
        studentList.put("Nam", 22);
        studentList.put("Hoang", 24);
        System.out.println("HashMap Student List");
        System.out.println(studentList);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Khanh", 20);
        linkedHashMap.put("Hoang", 24);
        linkedHashMap.put("Nam", 22);

        System.out.println("LinkedHashMap Student List");
        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(studentList);

        System.out.println("TreeMap Student List");
        System.out.println(treeMap);

    }
}
