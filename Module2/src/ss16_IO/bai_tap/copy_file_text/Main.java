package ss16_IO.bai_tap.copy_file_text;

import java.io.*;

public class Main {
    private static Integer id = 1;

    private static void copyFileText(File source, File dest) throws IOException {

        if (dest.isDirectory()) {
            dest = new File(dest, source.getName());
        }

        if (!source.exists()) {
            System.out.println("File is not exist!");
            return;
        }
        if (dest.exists()) {
            return;

        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }

    }

    public static void main(String[] args) {
        File sourceFile = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/demo.csv");
        File destFile = new File("/Users/nguyenkimquockhanh/Desktop/CodeGym/Module2/src/ss16_IO/bai_tap/copy_file_text");
        try {
            copyFileText(sourceFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
