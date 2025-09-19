package ss10_DSA_list.thuc_hanh.basic_linkedlist;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int numNodes;
     MyLinkedList(Object data){

     }

}
