package ЗаписьВфайл;


import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("data/file.txt");

            for (int i = 0; i < 100; i++) {
                writer.write(i + "\n");
            }
            writer.flush(); //write info in file(from buffer)
            writer.close(); //close file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}