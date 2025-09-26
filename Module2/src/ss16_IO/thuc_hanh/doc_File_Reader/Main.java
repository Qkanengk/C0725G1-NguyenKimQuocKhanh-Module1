package ss16_IO.thuc_hanh.doc_File_Reader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String path = "demo.txt";
        try (FileReader fileReader = new FileReader(path)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
