package CollectionsStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "A");
        map1.put(1020, "B");
        map1.put(1030, "C");
        map1.put(1040, "D");
        ArrayList<String> arr = new ArrayList<>();
        for (Map.Entry<Integer, String> i : map1.entrySet()) {

            arr.add(i.getValue());
            Collections.sort(arr);

        }
        System.out.println(arr);
    }
}
