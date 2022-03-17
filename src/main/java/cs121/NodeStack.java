package cs121;

public class NodeStack<T> implements Stack<T> {
    private NodeList<T> list = new NodeList<>();

    @Override
    public void push(T item) {
        list.addFront(item);
    }

    @Override
    public void pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        list.removeFront();
    }

    @Override
    public T top() {
        if (list.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        NodeList.Node<T> head = list.getHead();
        return head.getData();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        java.util.Enumeration<T> e = list.enumeration();
        StringBuilder sb = new StringBuilder();
        if (e.hasMoreElements()) {
            sb.append(e.nextElement().toString());
        }
        while (e.hasMoreElements()) {
            sb.append(", ");
            sb.append(e.nextElement().toString());
        }
        return sb.toString();
    }
}
