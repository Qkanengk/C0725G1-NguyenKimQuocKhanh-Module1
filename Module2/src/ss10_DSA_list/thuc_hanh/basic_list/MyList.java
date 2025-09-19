package ss10_DSA_list.thuc_hanh.basic_list;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int defaultCapacity = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[defaultCapacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
