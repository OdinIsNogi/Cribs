package InputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutPut {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileWriter fr = null;
        String str = "Java";
        File file = new File("G:\\3.txt");

        try {
            fr = new FileWriter(file,true); //создаем файл в директории
            fr = new FileWriter("C:\\Users\\user\\Desktop\\Командная строка.txt"); // по адресу
            fr.write(str);                                                                 // добавляем строки
//            fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop" +
//                    "\\Командная строка.txt"); перезаписывает содержимое
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }
}

