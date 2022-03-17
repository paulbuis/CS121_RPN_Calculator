package cs121;

public interface Stack<T> {
    void push(T item);
    void pop();
    T top();
    boolean isEmpty();
}
