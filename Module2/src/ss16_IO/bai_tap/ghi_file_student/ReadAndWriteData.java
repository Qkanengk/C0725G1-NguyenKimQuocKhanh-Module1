package ss16_IO.bai_tap.ghi_file_student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteData {

    public static void writeData(File path, List<Student> studentList) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(studentList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readData(File path) {
        List<Student> studentList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            studentList = (List<Student>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
