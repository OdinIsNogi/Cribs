package Threads;

import lombok.SneakyThrows;

public class WaitNotify {
    public static void main(String[] args) {
        Market market = new Market();
        Thread thread1 = new Thread(new Producer(market));
        Thread thread2 = new Thread(new Consumer(market));

        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() throws InterruptedException {
        while (breadCount < 1) {
            wait();
        }
        breadCount--;
        System.out.println("Customer buy 1 bread");
        System.out.println("Left " + breadCount);
        notify();
    }

    public synchronized void putBread() throws InterruptedException {
        while (breadCount >= 5) {
            wait();
        }
        breadCount++;
        System.out.println("Producer add 1 bread");
        System.out.println("Bread number: " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}