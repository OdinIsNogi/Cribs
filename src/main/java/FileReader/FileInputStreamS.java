package FileReader;


import java.io.FileInputStream;


public class FileInputStreamS {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        try {
            FileInputStream is = new FileInputStream("H:\\Check\\lib\\T.txt");
            for (; ; )
            {
                int code = is.read(); // reads byte of data
                if (code < 0) {
                    break;
                }
                char ch = (char) code; // convert to symbol
                builder.append(ch); //обновляем builder
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(builder.toString());
    }
}
