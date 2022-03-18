package app;

import java.util.function.BinaryOperator;

public interface Operators<T> {
    BinaryOperator<T> lookup(String operatorSymbol);
}
