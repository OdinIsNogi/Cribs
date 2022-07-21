package Streams;

import java.util.Arrays;

public class Ex3ForEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 1, 8, 3};
        //forEach возвращает void
        //Utils::myMethod ссылка на метод
        Arrays.stream(array).forEach(value -> {
            value *= 2;
            System.out.println(value);
        });
        Arrays.stream(array).forEach(Utils::myMethod);
    }

    static class Utils {
        public static void myMethod(int a) {
            a += 5;
            System.out.println("Elemt a: " + a);
        }
    }
}