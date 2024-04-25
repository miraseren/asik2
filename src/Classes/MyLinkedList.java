package Classes;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private class MyNode<T> {
        T data;
        MyNode<T> next;

        public MyNode(T data) {
            this.data = data;
            next = null;
        }
    }

    private MyNode<T> head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = newNode;
        }
        else {
            MyNode<T> currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        MyNode<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = item;
    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);
        MyNode<T> newNode = new MyNode<>(item);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyNode<T> previousNode = head;
            for (int i = 1; i < index; i++) {
                previousNode = previousNode.next;
            }
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(T item) {
        add(0,item);
    }

    @Override
    public void addLast(T item) {
        add(size-1,item);
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        MyNode<T> currentNode = head;
        for(int i = 0;i<index;i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size-1);
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> previousNode = head;
            for(int i = 1;i<index;i++) {
                previousNode = previousNode.next;
            }
            previousNode.next = previousNode.next.next;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size-1);
    }


    @Override
    public void sort() {
        for (int i = 0; i < size; i++) {
            MyNode<T> currentNode = head;
            while (currentNode != null && currentNode.next != null) {
                if (compare(currentNode.data,currentNode.next.data)) {
                    T temp = currentNode.data;
                    currentNode.data = currentNode.next.data;
                    currentNode.next.data = temp;
                }
                currentNode = currentNode.next;
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        MyNode<T> currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(object)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> currentNode = head;
        int index = -1;
        for (int i =0;i<size;i++) {
            if (currentNode.data.equals(object)) {
                index = i;
            }
            currentNode = currentNode.next;
        }
        return index;
    }

    @Override
    public boolean exists(Object object) {
        MyNode<T> currentNode = head;
        while(currentNode != null) {
            if(currentNode.data.equals(object)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode<T> currentNode = head;
        for (int i = 0; i< size;i++) {
            array[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new MyLinkedListIterator();
    }
    private class MyLinkedListIterator implements Iterator<T> {
        MyNode<T> currentNode = head;
        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }
            throw new ArrayIndexOutOfBoundsException("there is no elements in the list.");
        }
    }
    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("index not correct");
        }
    }
    private boolean compare(Object obj1, Object obj2) {
        if (obj1 instanceof Integer && obj2 instanceof Integer) {
            return ( (Integer) obj1 > (Integer) obj2 );
        } else if (obj1 instanceof Double && obj2 instanceof Double) {
            return ( (Double) obj1 > (Double) obj2);
        } else if (obj1 instanceof Integer && obj2 instanceof Double) {
            return ((Integer) obj1 > (Double) obj2);
        } else if (obj1 instanceof Double && obj2 instanceof Integer) {
            return ( (Double) obj1 > (Integer) obj2 );
        } else {
            throw new IllegalArgumentException("Unsupported types for comparison: " + obj1.getClass() + " and " + obj2.getClass());
        }
    }
}