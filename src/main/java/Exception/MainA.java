package Exception;

public class MainA {
    public static void main(String[] args) {
        try {
            printHello(new B());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printHello(A a) throws Exception {
        a.printHello();
    }
}
