package Threads;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        InterrruptedThread thread = new InterrruptedThread();
        System.out.println("Main start");
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("End");
    }
}

class InterrruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 1; i <= 1_000_000_000; i++) {
            sqrtSum += Math.sqrt(i);
            if (isInterrupted()) {
                System.out.println("Interrupt");
                System.out.println(sqrtSum);
                return;
            }
            try {
                sleep(100);

            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}