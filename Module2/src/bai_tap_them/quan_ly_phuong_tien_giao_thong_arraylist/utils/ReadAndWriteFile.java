package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeListStringToCSV(File filePath, List<String> list, boolean append) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, append))) {
            for (String line : list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
    }

    public static List<String> readFileCSVToList(File filePath) throws IOException {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        }
        return stringList;
    }
}
