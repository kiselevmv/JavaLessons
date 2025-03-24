public class NumberPrinter extends Thread {
    public NumberPrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            NumberPrinter thread = new NumberPrinter("Thread-" + i);
            thread.start();
        }
    }
}