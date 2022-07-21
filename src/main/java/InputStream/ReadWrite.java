package InputStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWrite {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Desktop\\text.txt";
        String path2 = "C:\\Users\\user\\Desktop\\out.txt";
        //File file = new File(path); //создаем файл
        // file.mkdirs(); // если путь не существует - создаются все папки

        try {
            Files.writeString(Paths.get(path2), "path", StandardOpenOption.WRITE);


            String data = Files.readString(Paths.get(path)); // читаем файл
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
//ЧТЕНИЕ И ЗАПИСЬ В ФАЙЛ
//try {
//        FileOutputStream out = new FileOutputStream(path);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//        sb.append(i + "\n");
//        }
//        out.write(sb.toString().getBytes());
//        out.flush(); сбрасываем кэш
//        out.close();
//        } catch (IOException e) {
//        e.printStackTrace();
//        }

// Чтение файлы InputStream
//        try {
//            StringBuilder sb = new StringBuilder();
//            FileInputStream inputStream = new FileInputStream(path); // Стрим байтов
//            while (true) {
//                int code = inputStream.read();
//                if (code < 0) { // -1 байт
//                    break;
//                }
//                sb.append((char) code); // полученные байты преобразуем в символы и добавляем
//            }
//            inputStream.close();
//            System.out.println(sb);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }