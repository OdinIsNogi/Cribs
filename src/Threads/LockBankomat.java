package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockBankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("A", lock);
        new Employee("B", lock);
        new Employee("C", lock);
        Thread.sleep(5000);
        new Employee("D", lock);
        new Employee("I", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }


    public void run() {
        if (lock.tryLock()) {
//        System.out.println(name + " waiting");
//        lock.lock();
            try {
                System.out.println(name + " using bankomat");
                Thread.sleep(2000);
                System.out.println(name + " stop using");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name);
        }
    }
}