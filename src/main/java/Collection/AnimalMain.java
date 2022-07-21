package Collection;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal("C", 2, 2, 3);
        Animal dog = new Animal("A", 4, 5, 1);
        Animal bird = new Animal("B", 1, 1, 96);

        Animal[] c = {cat, dog, bird};
        for (Animal tmp : c) {
            tmp.price += 10;
            //   tmp = new Animal("4", 50); нельзя менять объекты в массиве!!
        }
        for (Animal tmp : c) {
            System.out.println(tmp.breed + " " + tmp.price);
        }
        Arrays.sort(c, new ComparatorPrice());
        for (Animal tmp : c)
            System.out.println(tmp);
    }
}
