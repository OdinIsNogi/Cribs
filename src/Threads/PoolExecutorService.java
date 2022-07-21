package Threads;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolExecutorService {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 10; i++) {
            service.execute(new R());
        }
        service.shutdown();

        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}

class R implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(500);
    }
}