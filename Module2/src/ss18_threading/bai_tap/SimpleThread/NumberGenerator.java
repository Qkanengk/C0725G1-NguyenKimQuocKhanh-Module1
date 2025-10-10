package ss18_threading.bai_tap.SimpleThread;

public class NumberGenerator implements Runnable {
    private Thread thread;

    public NumberGenerator() {
        thread = new Thread(this, "NumberGenerator");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Hashcode: " + thread + " generated: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
