package bai_tap_them.IO.Ghi_FIle.File_Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static final String FILE_PATH = "/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/demo.txt";

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write("This is line: " + i);
                bufferedWriter.newLine();
            }
            System.out.println("Write file done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
