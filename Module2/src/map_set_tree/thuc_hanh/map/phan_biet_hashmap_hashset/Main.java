package map_set_tree.thuc_hanh.map.phan_biet_hashmap_hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Student, Integer> hashMapList = new HashMap<>();
        hashMapList.put(new Student(10, "Khanh", "HCM"), 1);
        hashMapList.put(new Student(20, "Khanh", "HCM"), 2);
        hashMapList.put(new Student(30, "Nam", "HCM"), 3);
        hashMapList.put(new Student(30, "An", "HCM"), 4);
        Set<Student> hashSetList = new HashSet<>();
        hashSetList.add(new Student(10, "Khanh", "HCM"));
        hashSetList.add(new Student(20, "Khanh", "HCM"));
        hashSetList.add(new Student(30, "Nam", "HCM"));
        hashSetList.add(new Student(30, "An", "HCM"));
        for (Map.Entry<Student, Integer> entry : hashMapList.entrySet()) {
            System.out.println(entry.getKey().getName() + "\n" + entry.getKey().getAge() + "\n" + entry.getKey().getAddress() + "\n" + entry.getValue());
        }

        Student student = new Student(30, "Kien", "HT");
        Student student1 = new Student(26, "Nam", "HN");
        Student student2 = new Student(38, "Anh", "HT");
        Student student3 = new Student(38, "Tung", "HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.getName());
        }

        for (Student studentL : hashSetList) {
            System.out.println(studentL.getName() + "\n" + studentL.getAge() + "\n" + studentL.getAddress());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.getName());
        }


    }
}
