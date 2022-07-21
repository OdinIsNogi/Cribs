package HashcodeEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Adress> adressSet = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            adressSet.add(new Adress(i, i, "Russia" + i, "Kosmonavtov" + i));
        }
        createSet(adressSet);
    }

    public static void createSet(List<Adress> adressList) {
        long start = System.currentTimeMillis();
        Set<Adress> adressSet = new HashSet<>(adressList);
        long end = System.currentTimeMillis();
        System.out.println("completed in " + (end - start));
    }
}