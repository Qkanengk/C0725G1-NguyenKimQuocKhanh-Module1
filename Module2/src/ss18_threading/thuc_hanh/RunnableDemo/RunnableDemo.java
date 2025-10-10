package ss18_threading.thuc_hanh.RunnableDemo;

public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Created: " + threadName);
    }

    @Override
    public  void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " exiting");
    }
    public  void  start(){
        System.out.println("Starting "+threadName);
        if (thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
