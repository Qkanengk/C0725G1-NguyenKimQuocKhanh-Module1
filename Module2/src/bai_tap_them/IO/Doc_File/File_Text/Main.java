package bai_tap_them.IO.Doc_File.File_Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static final String FILE_PATH = "/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/demo.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
