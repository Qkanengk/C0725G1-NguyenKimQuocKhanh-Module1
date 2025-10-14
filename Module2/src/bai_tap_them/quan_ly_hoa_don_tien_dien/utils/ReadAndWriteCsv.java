package bai_tap_them.quan_ly_hoa_don_tien_dien.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCsv {
    public static void writeDataIntoCSV(File filePath, List<String> data, boolean append) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, append));
        for (String line : data) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static List<String> readDataFromCSV(File filePath) throws IOException {
        List<String> data = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            data.add(s);
        }
        return data;
    }
}
