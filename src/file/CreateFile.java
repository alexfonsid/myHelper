package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void createFile() {
        try {
            File file = new File("departments from file.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Hello world");
            printWriter.close();
        } catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
