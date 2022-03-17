package cs121;

public class NodeListDemo {
    public static void main(String[] args) {
        NodeList<Integer> list = new NodeList<>();
        list.addFront(2);
        list.addFront(5);
        list.addBack(1);

        NodeList.Node<Integer> node = list.getHead();
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }

        NodeList<String> stringList = new NodeList<>();
        stringList.addFront("B");
        stringList.addFront("E");
        stringList.addBack("A");

        for (String s: stringList) {
            System.out.println(s);
        }
    }
}
