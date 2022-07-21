package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //map для работы с элементами
        //collect собрать в новом листе
        //значение исходного листа не изменяются
        List<Integer> list2 = list.stream().map(String::length).collect(Collectors.toList());



    }
}
