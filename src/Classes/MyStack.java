package Classes;

public class MyStack<T> {
    MyArrayList<T> myStack = new MyArrayList<>();

    public boolean empty() {
        return myStack.size() == 0;
    }
    public int size() {
        return myStack.size();
    }
    public T peek() {
        return (T) myStack.getLast();
    }
    public T push(T item) {
        myStack.addLast(item);
        return (T) myStack.getLast();
    }
    public T pop() {
        T item = (T) myStack.getLast();
        myStack.removeLast();
        return item;
    }
}