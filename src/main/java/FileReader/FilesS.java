package FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesS {
    public static void main(String[] args) throws Exception {
    StringBuilder sb = new StringBuilder();

    List<String> lines = Files.readAllLines(Paths.get("H:\\Check\\lib\\T.txt"));
//    lines.forEach(line -> sb.append(lines + "\n"));
        sb.append(lines + "\n");
        System.out.println(sb.toString());
    }
}
