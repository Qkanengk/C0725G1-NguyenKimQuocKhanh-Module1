package bai_tap_them.quan_ly_nhan_su_cong_ty.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    public static void write(File file, List<String> data, boolean append) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, append));
        for (String s : data) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static List<String> read(File file) throws IOException {
        List<String> data = new ArrayList<>();
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while ((line = bufferedReader.readLine()) != null) {
            data.add(line);
        }
        bufferedReader.close();
        return data;
    }

}
