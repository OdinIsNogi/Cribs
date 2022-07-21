package Streams;

import java.util.Arrays;

public class ExSorted {
    public static void main(String[] args) {
        int[] array = {2, 8, 1, 59, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        //ПРИМЕР сортировки в Ex2Filter

//Находим сумму по условиям
        int result = Arrays.stream(array).filter(value -> value % 2 == 1).
                map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).reduce(Integer::sum).getAsInt();




    }
}