package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("FileReader.Test.txt");

        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.toString(words).replace("[","")
                .replace("]","")
                .replace(","," "));


        }
    }


