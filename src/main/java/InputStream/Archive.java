package InputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Archive {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Desktop\\";
        String in = path + "Arch";
        String out = path + "picture.zip";
        try {
            FileOutputStream outputStream = new FileOutputStream(out);
            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
            writeFileToZip(new File(in), zipOut, "");
            zipOut.flush();
            zipOut.close();
            outputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileToZip(File file, ZipOutputStream zipOut, String path) throws IOException {
        if (file.isDirectory()) {
            String folder = path + file.getName() + "\\";
            ZipEntry entry = new ZipEntry(folder);
            zipOut.putNextEntry(entry);
            zipOut.closeEntry();
            File[] files = file.listFiles();
            for (File subFile : files) {
                writeFileToZip(subFile, zipOut, folder);
            }
            return;
        }
        ZipEntry entry = new ZipEntry(path + file.getName());
        zipOut.putNextEntry(entry);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
        zipOut.write(bytes);
    }
}
// Архивируем несколько файлов - String[] in = {"picture.png", "text.txt", "picture.zip","copy.jar"};
//        try {
//            FileOutputStream outputStream = new FileOutputStream(out);
//            ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//            for (String fileName : in) {
//                File file = new File(path + fileName);
//                ZipEntry entry = new ZipEntry(file.getName());
//                zipOut.putNextEntry(entry);
//                Path filePath = Paths.get(file.getAbsolutePath());
//                byte[] data = Files.readAllBytes(filePath);
//                zipOut.write(data);
//            }
//            zipOut.flush();
//            zipOut.close();
//            outputStream.close();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

// Архивирование 1 файла
//    String path = "C:\\Users\\user\\Desktop\\";
//    String in = path + "picture.png";
//    String out = path + "picture.zip";
//
//        try {
//                FileOutputStream outputStream = new FileOutputStream(out);
//                ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//                ZipEntry entry = new ZipEntry(new File(in).getName());
//                zipOut.putNextEntry(entry);
//                byte[] data = Files.readAllBytes(Paths.get(in));
//                zipOut.write(data);
//                zipOut.flush();
//                zipOut.close();
//                outputStream.close();
//
//
//                } catch (IOException e) {
//                e.printStackTrace();
//                }