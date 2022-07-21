package Streams;

import java.util.stream.Stream;

public class ExCount {
    //колличество эллементов в стриме, возвращает Long
    public static void main(String[] args) {
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        System.out.println(stream2.distinct().count());
    }
}
