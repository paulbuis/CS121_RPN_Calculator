package app;

public interface Evaluator<T>{
    void addOperand(T operand);
    void processBinaryOperator(String operator);
    T getResult();
}
