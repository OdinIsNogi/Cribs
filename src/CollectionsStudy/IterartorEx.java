package CollectionsStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class IterartorEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("I");
        list.add("F");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println(list);
        }
    }
}
