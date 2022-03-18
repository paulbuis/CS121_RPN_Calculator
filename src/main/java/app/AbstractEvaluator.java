package app;

import cs121.Stack;

import java.util.function.BinaryOperator;

public abstract class AbstractEvaluator<T> implements Evaluator<T>{
    protected final Stack<T> stack ;
    protected final Operators<T> operators;

    protected AbstractEvaluator(Stack<T> stack, Operators<T> operators) {
        this.stack = stack;
        this.operators = operators;
    }

    public void addOperand(T operand) {
        stack.push(operand);
    }

    public void processBinaryOperator(String operator) {
        BinaryOperator<T> op = operators.lookup(operator);
        if (op != null) {
            T right = stack.top();
            stack.pop();
            T left = stack.top();
            stack.pop();
            T result = op.apply(left, right);
            stack.push(result);
        } else {
            System.err.println(operator + ": no such operator");
        }
    }

    public T getResult() {
        return stack.top();
    }

    @Override
    public String toString() {
        return "Evaluator.stack=[" + stack + "]";
    }
}
