package Exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class GenericTodo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");

        someClass<String> s = new someClass<>();
        someClass<?> s2 = new someClass<>();

        s.test(stringList);
        s2.test(stringList);
    }

    public static class someClass<T> {
        public <E> void test(Collection<E> collection) {
            System.out.println("E");
            for (E e : collection) {
                System.out.println(e);
            }
        }

        public <E> void test(List<Integer> integerList) {
            System.out.println("Integer");
            for (Integer i : integerList) {
                System.out.println(i);

            }
        }
    }
}
