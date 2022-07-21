package WorkWithFiles.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
            employees = (List<String>) inputStream.readObject();
            System.out.println(employees);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}