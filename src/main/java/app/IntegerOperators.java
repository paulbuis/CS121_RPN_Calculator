package app;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class IntegerOperators implements Operators<Integer> {
    private final IntBinaryOperator[] operatorArray = new IntBinaryOperator[256];

    public IntegerOperators() {
        operatorArray['+'] = (left, right) -> left + right;
        operatorArray['-'] = (left, right) -> left - right;
        operatorArray['*'] = (left, right) -> left * right;
        operatorArray['/'] = (left, right) -> left / right;
        operatorArray['%'] = (left, right) -> left % right;
    }

    public BinaryOperator<Integer> lookup(String operatorSymbol) {
        char ch = operatorSymbol.charAt(0);
        IntBinaryOperator op = operatorArray[ch];
        return new Adaptor(op);
    }
}

class Adaptor implements BinaryOperator<Integer> {
    private IntBinaryOperator ibo;

    public Adaptor(IntBinaryOperator ibo) {
        this.ibo = ibo;
    }

    @Override
    public Integer apply(Integer left, Integer right) {
        return ibo.applyAsInt(left, right);
    }
}

