package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderS {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader("H:\\Check\\lib\\T.txt"));
        for (; ; ) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            s.append(line + "\n");
        }
        System.out.println(s);
    }
}
