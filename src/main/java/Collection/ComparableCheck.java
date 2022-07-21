package Collection;

import java.util.Arrays;

public class ComparableCheck {
    public static void main(String[] args) {
        int[] marks = {7, 5, 6, 2, 9};
        String[] students = {"Alex", "Bob", "Tod", "Anna"};
        Arrays.sort(marks); //sort сортирует по возрастанию
        Arrays.sort(students); //sort по возростанию значений в Юникоде

        for (int tmp : marks) {
            System.out.println(tmp + " ");
        }
        for (String tmp : students) {
            System.out.println(tmp + " ");
        }
    }
}
