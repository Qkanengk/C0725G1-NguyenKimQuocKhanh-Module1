package ss10_DSA_list.bai_tap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int defaultCapacity = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[defaultCapacity];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else throw new IllegalArgumentException("capacity: " + capacity);

    }

    public boolean add(E e) {
        if (elements.length == size) {
            ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;

    }

    public void add(int index, E e) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = e;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = elements;
            size++;
        }

    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else throw new IllegalArgumentException("minCapacity: " + minCapacity);

    }


    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public MyList<E> clone(){
        MyList<E> v =new MyList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index){
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("index: "+index);
        }
        E element = (E)elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
            
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
