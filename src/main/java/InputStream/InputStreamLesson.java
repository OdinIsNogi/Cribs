package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamLesson {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b = 0;
        try {
            fis = new FileInputStream("C:\\Users\\user\\Desktop" +
                    "\\Командная строка.txt");
            isr = new InputStreamReader(fis,"UTF-8");
            while ((b = isr.read()) != -1) {
                System.out.println((char)b);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
