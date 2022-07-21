package Threads;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}


class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: TRY monitor Lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Thread10: CATCH monitor Lock1");
            System.out.println("Thread10: TRY monitor Lock2");
            synchronized (DeadLock.lock2) {
                System.out.println("Thread10: CATCH monitor Lock1/Lock2");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: TRY monitor Lock1");
        synchronized (DeadLock.lock1) {
            System.out.println("Thread20: CATCH monitor Lock1");
            System.out.println("Thread20: TRY monitor Lock2");
            synchronized (DeadLock.lock2) {
                System.out.println("Thread20: CATCH monitor Lock2/Lock1");
            }
        }
    }
}