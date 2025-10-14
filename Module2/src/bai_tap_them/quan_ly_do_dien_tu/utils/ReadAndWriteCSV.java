package bai_tap_them.quan_ly_do_dien_tu.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    public static List<String> readDataFromCSV(File filePath) throws IOException {
        List<String> stringList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringList.add(line);
        }
        bufferedReader.close();
        return stringList;
    }

    public static void writeDataToCSV(File filePath, List<String> list, boolean append) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        for (String line : list) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
