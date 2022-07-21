package WorkWithFiles;

import java.io.*;

public class BufferedWriterAndReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("text3.txt"));

        String line;
        while ((line= reader.readLine()) != null) {
            writer.write(line);
        }

//        int character;
//        while ((character = reader.read()) !=-1) {
//            writer.write(character);
//        }
        writer.close();
    }
}
