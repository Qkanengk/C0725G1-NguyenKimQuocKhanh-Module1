package ss18_threading.thuc_hanh.RunnableDemo;

public class Main {
    public static void main(String[] args) {
        RunnableDemo runnableDemo1 = new RunnableDemo("HR database");
        RunnableDemo runnableDemo2 = new RunnableDemo("Send email");
        runnableDemo1.start();
        runnableDemo2.start();
    }

}
