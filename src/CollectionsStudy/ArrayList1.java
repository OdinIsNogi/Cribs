package CollectionsStudy;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("I");
        list.add("F");

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(list);
        System.out.println(list2);
    }
}
