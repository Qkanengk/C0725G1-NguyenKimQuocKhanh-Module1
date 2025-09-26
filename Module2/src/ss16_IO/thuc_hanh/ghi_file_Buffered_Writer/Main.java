package ss16_IO.thuc_hanh.ghi_file_Buffered_Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String path = "/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/demo.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write("bw1");
            bufferedWriter.newLine();
            bufferedWriter.write("bw2");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
