package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCheck {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();

        al.add(2);
        al.add(8);
        al.add(5);
        System.out.println(al);

        Iterator<Integer> iterator = al.iterator(); //создаем итератор
        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.print(tmp);
        }
    }
}
