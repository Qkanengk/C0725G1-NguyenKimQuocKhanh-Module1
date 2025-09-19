package ss10_DSA_list.bai_tap.ArrayList;

public class Main {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MyList<Student> studentMyList = new MyList<>();
        Student student1 = new Student(1,"Khanh");
        Student student2 = new Student(2,"Nam");
        Student student3 = new Student(3,"Viet");

        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);

        studentMyList.add(2, new Student(4,"Lan"));

        System.out.println(studentMyList.size());
    }
}
