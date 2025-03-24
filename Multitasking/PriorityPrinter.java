public class PriorityPrinter implements Runnable {
    @Override
    public void run() {
        int priority = Thread.currentThread().getPriority();
        for (int i = 1; i <= 50; i++) {
            if (i % priority == 0) {
                System.out.println(Thread.currentThread().getName() + " (Priority " + priority + "): " + i);
            }
        }
    }

    public static void main(String[] args) {
        PriorityPrinter printer = new PriorityPrinter();

        Thread thread1 = new Thread(printer, "Thread-1");
        thread1.setPriority(Thread.MIN_PRIORITY);

        Thread thread2 = new Thread(printer, "Thread-2");
        thread2.setPriority(Thread.NORM_PRIORITY - 2);

        Thread thread3 = new Thread(printer, "Thread-3");
        thread3.setPriority(Thread.NORM_PRIORITY);

        Thread thread4 = new Thread(printer, "Thread-4");
        thread4.setPriority(Thread.NORM_PRIORITY + 2);

        Thread thread5 = new Thread(printer, "Thread-5");
        thread5.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}