package WorkWithFiles;

import java.io.*;

public class InOutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("C:\\Users\\user\\Desktop\\Switch.jpg");
        FileOutputStream out = new FileOutputStream("java.jpg");
        int i;
        while ((i=input.read())!=-1) {
            out.write(i);
        }




    }
}
