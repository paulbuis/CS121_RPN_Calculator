package cs121;

import java.util.ArrayList;

public class ArrayStack<T> implements Stack<T> {
    private final ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public void pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        int topIndex = list.size() - 1;
        list.remove(topIndex);
    }

    @Override
    public T top() {
        if (list.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        int topIndex = list.size() - 1;
        return list.get(topIndex);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
