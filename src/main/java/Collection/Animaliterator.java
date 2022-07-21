package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Animaliterator {
    public static void main(String[] args) {
    ArrayList<Animal> al = new ArrayList<>();
    al.add(new Animal("A", 10,2,3));
    al.add(new Animal("B", 10,5,6));
    al.add(new Animal("C", 10,78,96));


    Iterator<Animal> iterator = al.iterator();
    while (iterator.hasNext()) {
        Animal x = iterator.next();
        x.breed = "Cat";
    }
        System.out.println(al);

    }
}
