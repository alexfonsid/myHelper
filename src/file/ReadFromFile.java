package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JAVA\\Data\\departments.txt";

        FileInputStream stream = new FileInputStream(path);
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);
        String text = new String(data);
        System.out.println(text);
    }

    public static void dataFromFile(File file) {
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
