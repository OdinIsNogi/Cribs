package WorkWithFiles;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("text1.txt");
        int character;
        System.out.println((char) reader.read());
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}
