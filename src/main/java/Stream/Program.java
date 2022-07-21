package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bob", 31));
        persons.add(new Person("Tom", 19));
        persons.add(new Person("Karl", 21));
        persons.add(new Person("Jhon", 5));
        persons.add(new Person("Anna", 57));

//        for (Person p : persons) {
//            System.out.println(p);

//        persons.stream().forEach(
//                p -> System.out.println(p)
//        );
//        persons.stream().forEach(
//                System.out::println
//        );

        persons.stream()
                .filter(person -> person.getAge() > 5) //фильтр
                .sorted(Comparator.comparing(Person::getName)) // сортировка
                .map(person -> person.getName()) //преобразование внутри коллекции(выводим только "имена")
                .forEach(System.out::println); //для каждого
    }
}

