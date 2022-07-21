package Exception;

public class B extends A{
    @Override
    void printHello() throws RuntimeException {
        System.out.println("HelloB");
        throw new RuntimeException();
    }
}
