package Threads;

import java.util.concurrent.*;

public class CallablaFuture {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        Future<Integer> future = service.submit(factorial);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get a result");
            factorialResult = future.get();
            System.out.println(future.isDone());
            System.out.println("Result");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            service.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial implements Callable<Integer> {
    int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (f <= 0) {
            throw new Exception("You enter wrong number");
        }
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }

        return result;
    }
}