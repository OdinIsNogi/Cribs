package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//reduce возвращает Optional, ОДНО значение
public class ExReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();


        //чтобы избежать ошибок(пустой список или значение null у элемента) оборачиваем в Optional
        //проверяем isPresent и выводим
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not");
        }

     //если мы указали начальное значение аккумулятора,
        // то get не нужен, так как в любом случае получим какое-то значение(не null)
        int result2 = list.stream().reduce(1,(accumulator, element) -> accumulator * element);
    }
}
