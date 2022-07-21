package Threads;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SheduledExecutorEx {
    @SneakyThrows
    public static void main(String[] args) {

        ScheduledExecutorService service1 = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

//            service1.schedule(new R1(), 3, TimeUnit.SECONDS);
//            service1.shutdown();

//    service1.scheduleAtFixedRate(new R1(),3,8,TimeUnit.SECONDS); //от delay от старта первого задания до старта второго

        service1.scheduleWithFixedDelay(new R1(), 3, 1, TimeUnit.SECONDS); //от delay от конца первого задания до старта второго

        Thread.sleep(20_000);
        service1.shutdown();

//        ExecutorService executor = Executors.newCachedThreadPool(); //сам создает и удаляет потоки по необходимости


    }
}

class R1 implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + " End");
    }
}