package bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.utils;

import bai_tap_them.quan_ly_phuong_tien_giao_thong_arraylist.entity.Vehicle;

import javax.lang.model.element.Element;
import java.io.*;
import java.lang.annotation.ElementType;

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

    public static <T> void writeDataToBinaryFile(File filePath, List<T> list) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
        }
    }

    public static <T> List<T> readBinaryFile(File filePath) throws Exception{
        List<T> list = new ArrayList<T>();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            list = (List<T>) objectInputStream.readObject();
        }
        return list;
    }
}
