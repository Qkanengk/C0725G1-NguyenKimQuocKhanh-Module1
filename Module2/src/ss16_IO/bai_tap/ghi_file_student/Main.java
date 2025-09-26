package ss16_IO.bai_tap.ghi_file_student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        ReadAndWriteData.writeData(new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/demo.txt"),students);

        List<Student> list = ReadAndWriteData.readData(new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/demo.txt"));
        for(Student student:list){
            System.out.println(student);
        }
    }
}
