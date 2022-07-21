
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T extends Number> {
    public static void main(String[] args) {

    }

    public class someClass{
        public <T,E> void test(Collection<E> collection) {
            for (E e:collection){
                System.out.println(e);
            }
        }
        public <T,E> void test (List<Integer> integerList) {
            for (Integer i: integerList) {
                System.out.println(i);
            }
        }
    }
}

