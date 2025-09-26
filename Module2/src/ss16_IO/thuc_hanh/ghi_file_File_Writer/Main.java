package ss16_IO.thuc_hanh.ghi_file_File_Writer;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String path = "demo.txt";
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write("Hello");
            fileWriter.append('a');
            fileWriter.write("Line 2");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
