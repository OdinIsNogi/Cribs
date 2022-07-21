package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleCpmparableStudent implements Comparator {
    private String firstName;
    private int group;

    public SimpleCpmparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((SimpleCpmparableStudent) o1).firstName.compareTo(((SimpleCpmparableStudent) o2).firstName);
    }


    static class Main {
        public static void main(String[] args) {
            SimpleCpmparableStudent[] myStudent = {
                    new SimpleCpmparableStudent("Ted", 2),
                    new SimpleCpmparableStudent("Tod", 1),
                    new SimpleCpmparableStudent("Tyd", 3),
                    new SimpleCpmparableStudent("Tаd", 2),
                    new SimpleCpmparableStudent("Tad", 2),
            };
            Arrays.sort(myStudent, new SimpleCpmparableStudent("Tod",2));
            for (SimpleCpmparableStudent tmp : myStudent)
                System.out.println(tmp);
        }
    }
}