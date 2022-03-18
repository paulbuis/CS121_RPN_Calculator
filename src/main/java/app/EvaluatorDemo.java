package app;

public class EvaluatorDemo {
    public static void main(String[] args) {
        Evaluator<Integer> e1 = new ArrayEvaluator();
        e1.addOperand(4);
        e1.addOperand(3);
        e1.processBinaryOperator("+");
        System.out.println("4+3=" + e1.getResult());

        Evaluator<Integer> e2 = new NodeEvaluator();
        e2.addOperand(4);
        e2.addOperand(3);
        e2.addOperand(5);
        e2.processBinaryOperator("+");
        e2.processBinaryOperator("*");
        System.out.println("4*(3+5)=" + e2.getResult());
    }
}
