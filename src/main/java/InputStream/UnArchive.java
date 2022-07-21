package InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnArchive {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Desktop\\";
        String in = path + "123.zip";
        String out = path;

        try {
            FileInputStream inputStream = new FileInputStream(in);
            ZipInputStream zipInput = new ZipInputStream(inputStream);
            while (true) {
                ZipEntry entry = zipInput.getNextEntry();
                if (entry == null) {
                    break;
                }
                File file = new File(out + entry.getName());
                if (entry.isDirectory()) {
                    file.mkdirs();
                } else {
                    byte[] bytes = zipInput.readAllBytes();
                    Files.write(
                            Paths.get(file.getAbsolutePath()),
                            bytes,
                            StandardOpenOption.CREATE
                    );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
