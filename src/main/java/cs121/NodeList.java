package cs121;

public class NodeList<T> implements java.lang.Iterable<T> {
    static class Node<T> {
        private final T data;
        private Node<T> next;

        private Node(T data) {
            this(data, null);
        }

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFront(T data) {
        head = new Node<>(data, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void addBack(T data) {
        if (tail == null) {
            addFront(data);
            return;
        }
        var oldTail = tail;
        tail = new Node<>(data);
        oldTail.next = tail;
    }

    public void removeFront() {
        if (isEmpty()) {
            return;
        }
        if (tail == head) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public java.util.Iterator<T> iterator() {
        return (enumeration()).asIterator();
    }

    public java.util.Enumeration<T> enumeration() {
        return new NodeEnumeration();
    }

    private class NodeEnumeration implements java.util.Enumeration<T> {
        Node<T> currentNode = NodeList.this.head;


        @Override
        public boolean hasMoreElements() {
            return currentNode != null;
        }

        @Override
        public T nextElement() {
            if (hasMoreElements()) {
                Node<T> previousNode = currentNode;
                currentNode = currentNode.next;
                return previousNode.data;
            }
            return null;
        }
    }
}
