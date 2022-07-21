package Threads;

import lombok.SneakyThrows;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTut {
    @SneakyThrows
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Integer> sub = service.submit(new MyCallable());


//        if (!sub.isDone()) {
//            Thread.sleep(1000);
//            sub.cancel(true);
//        }

//        Integer id = sub.get();
//        System.out.println(id);

        while (!sub.isDone()) {
            System.out.println("Is not done");
            Thread.sleep(1000);
        }
        service.shutdown();

    }

    static class MyCallable implements Callable<Integer> {


        @Override
        public Integer call() throws Exception {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished: " + Thread.currentThread().getId());
            return 99;
        }
    }
}
