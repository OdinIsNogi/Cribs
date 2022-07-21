package WorkWithFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Что трезвый, что пьяный";
        String text = "Hello";

        FileWriter writer1 = new FileWriter("text1.txt",true);
        writer1.write(rubai);
        writer1.write(text);
        writer1.close();

        FileWriter writer = new FileWriter("H:\\Check\\resouces\\text.txt");
        for (int i = 0; i < rubai.length(); i++) {
            writer.write(rubai.charAt(i));
        }writer.close();

    }
}
