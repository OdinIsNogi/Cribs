package FileReader;

import java.io.File;

public class FileS {
    public static void main(String[] args) {
        File file = new File("G:\\");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());

            File folder = new File("G:\\folder"); //прописываем путь и имя
            folder.mkdir(); // создать папку folder
            folder.delete();//удалить папку


        }
    }
}