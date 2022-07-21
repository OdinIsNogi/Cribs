package Collection;

public class SimpleNumbers {
    public static void main(String[] args) {


        int[] x = {2, 5, 7, 8, 1};
        for (int i : x) {
            System.out.print(i);
        }
        System.out.println("\n");
        for (int i : x) {
            ++i;//добавляем 1 к результату
            System.out.print(i);
        }
        System.out.println("\n");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);

        }

    }
}