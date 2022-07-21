package Threads;

import lombok.SneakyThrows;

import java.util.stream.Stream;

public class Lock {

    static final Object lock = new Object();

    synchronized void mobileCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatsappCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            Thread.sleep(7000);
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableM());
        Thread thread2 = new Thread(new RunnableS());
        Thread thread3 = new Thread(new RunnableW());
        Stream.of(thread1, thread2, thread3).forEach(Thread::start);
    }
}

class RunnableM implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        new Lock().mobileCall();
    }
}

class RunnableS implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        new Lock().skypeCall();
    }
}

class RunnableW implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        new Lock().whatsappCall();
    }
}

