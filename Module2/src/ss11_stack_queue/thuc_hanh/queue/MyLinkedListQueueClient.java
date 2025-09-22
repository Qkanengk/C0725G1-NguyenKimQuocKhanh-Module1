package ss11_stack_queue.thuc_hanh.queue;

public class MyLinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(20);
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);

        System.out.println("Dequeued item is " + myLinkedListQueue.dequeue().key);

    }
}
