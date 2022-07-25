package file;

import java.io.*;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFromFile1() throws IOException {
        String path = "D:\\JAVA\\Data\\departments.txt";

        FileInputStream stream = new FileInputStream(path);
        int length = stream.available();
        byte[] data = new byte[length];
        int read = stream.read(data);
        String text = new String(data);
        System.out.println(text);
    }

    public static void readFromFile2(File file) {
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

    public static void readFromFile3(String path) throws IOException {
        Reader reader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int i = 0;
//        while ((i = reader.read()) != -1) {
//            System.out.print((char) i);
//        }

        while (bufferedReader.read() != -1) {
            System.out.println(bufferedReader.readLine());
        }
    }

    public static void readFromFile4(String path) throws IOException {
        InputStream inputStream = new FileInputStream(path);

        int length = inputStream.available();
        byte[] data = new byte[length];
        inputStream.read(data);

        String text = new String(data);
        System.out.println(text);


    }
}
