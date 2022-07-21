package Exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Phone implements Comparable<Phone>{
    String model;

    @Override
    public int compareTo(Phone o) {
        return 0;
    }
}
