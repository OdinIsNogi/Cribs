package WorkWithFiles;

import java.io.FileWriter;
import java.io.IOException;

public class TryWirhResources {
    public static void main(String[] args) {
        String rubai = "Что трезвый, что пьяный";
        String text = "Hello";


        try (FileWriter writer = new FileWriter("text2.txt", true)) {
            writer.write(rubai);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Ready!");
        }
    }
}