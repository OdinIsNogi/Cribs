package StreamAPI;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class API1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\out.txt"));
        String contents = new String(bytes, StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+")); //делим по пробелу
        long count = words.stream()
                .filter(w -> w.length() > 2)
                .count();
        System.out.println(count);

    }
}
