package app;

public class EvaluatorDemo {
    public static void main(String[] args) {
        Evaluator e1 = new Evaluator();
        e1.addOperand(4);
        e1.addOperand(3);
        e1.processBinaryOperator("+");
        System.out.println("4+3=" + e1.getResult());

        Evaluator e2 = new Evaluator();
        e2.addOperand(4);
        e2.addOperand(3);
        e2.addOperand(5);
        e2.processBinaryOperator("+");
        e2.processBinaryOperator("*");
        System.out.println("4*(3+5)=" + e2.getResult());
    }
}
