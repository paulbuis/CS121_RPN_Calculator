package cs121;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new NodeStack<>();
        s.push(3);
        s.push(4);
        System.out.printf("s= %s\n", s);
        int rightArgument = s.top();
        s.pop();
        int leftArgument = s.top();
        s.pop();
        int result = leftArgument - rightArgument;
        s.push(result);
        System.out.printf("s= %s\n", s);
    }
}
