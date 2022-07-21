package ЗаписьВфайл;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileRecord {
    public static void main(String[] args) {
        try {


            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                strings.add(Integer.toString(i));
            }
            Files.write(Paths.get("data/file2"), strings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}