package Threads;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockANDReentrantLock {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                call.mobileCall();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                call.skypeCall();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                call.whatsApp();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() throws InterruptedException {
        lock.lock(); // после lock -> только 1 поток может войти в метод
        System.out.println("Mobile call start");
        Thread.sleep(3000);
        System.out.println("Mobile call STOP");
        lock.unlock();
    }

    void skypeCall() throws InterruptedException {
        lock.lock(); // после lock -> только 1 поток может войти в метод
        System.out.println("Skype call start");
        Thread.sleep(5000);
        System.out.println("Skype call STOP");
        lock.unlock();
    }

    void whatsApp() throws InterruptedException {
        lock.lock(); // после lock -> только 1 поток может войти в метод
        System.out.println("WhatsApp call start");
        Thread.sleep(7000);
        System.out.println("WhatsApp call STOP");
        lock.unlock();
    }
}