package app;

import cs121.*;
import java.util.function.IntBinaryOperator;

public class Evaluator {
    private Stack<Integer> stack = new NodeStack<>();
    private IntBinaryOperator[] operatorArray = new IntBinaryOperator[256];

    public Evaluator() {
        operatorArray['+'] = (left, right) -> left + right;
        operatorArray['-'] = (left, right) -> left - right;
        operatorArray['*'] = (left, right) -> left * right;
        operatorArray['/'] = (left, right) -> left / right;
        operatorArray['%'] = (left, right) -> left % right;
    }

    public void addOperand(int operand) {
        stack.push(operand);
    }

    public void processBinaryOperator(String operator) {
        char ch = operator.charAt(0);
        IntBinaryOperator op = operatorArray[ch];
        if (op != null) {
            int right = stack.top();
            stack.pop();
            int left = stack.top();
            stack.pop();
            int result = op.applyAsInt(left, right);
            stack.push(result);
        } else {
            System.err.println(ch + ": no such operator");
        }
    }

    public int getResult() {
        return stack.top();
    }

    @Override
    public String toString() {
        return "Evaluator.stack=[" + stack.toString() + "]";
    }
}
