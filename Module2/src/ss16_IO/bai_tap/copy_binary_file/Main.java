package ss16_IO.bai_tap.copy_binary_file;

import java.io.*;

public class Main {
    private static void copyBinaryFile(File source, File des) throws IOException {
        if (des.isDirectory()) {
            des = new File(des, source.getName());
        }

        FileInputStream fileInputStream = new FileInputStream(source);
        FileOutputStream fileOutputStream = new FileOutputStream(des);
        byte[] buffer = new byte[1000];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }
    }

    public static void main(String[] args) {
        File source = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/demo.txt");
        File des = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/ss16_IO/bai_tap/copy_binary_file/");
        try {
            copyBinaryFile(source, des);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
