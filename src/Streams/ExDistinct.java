package Streams;

import java.util.stream.Stream;

public class ExDistinct {
    //возвращает уникальные значения
    public static void main(String[] args) {
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream2.distinct().forEach(System.out::println);
    }


}
