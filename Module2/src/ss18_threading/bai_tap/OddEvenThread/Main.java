package ss18_threading.bai_tap.OddEvenThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());
        oddThread.start();
        evenThread.start();
    }
}
