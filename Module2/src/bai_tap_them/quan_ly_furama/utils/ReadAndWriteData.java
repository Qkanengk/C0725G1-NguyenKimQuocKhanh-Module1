package bai_tap_them.quan_ly_furama.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteData {
    public static void writeDataToCSV(File filePath, List<String> data, boolean append) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, append))) {
            for (String line : data) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
    }

    public static List<String> readDataFromCSV(File filePath) throws IOException,ArrayIndexOutOfBoundsException {
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
