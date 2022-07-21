package Maven;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String data = getDataFromFile("data/staff.json");
    }

    private static String getDataFromFile (String path) {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for(String line : lines) {
                builder.append(line); // append обновляет значение объекта, который его вызвал
            }
        }catch (Exception e) {
            e.printStackTrace();
        }return builder.toString();
    }
}
