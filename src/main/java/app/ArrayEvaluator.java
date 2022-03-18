package app;

import cs121.*;

public class ArrayEvaluator extends AbstractEvaluator<Integer> {
    public ArrayEvaluator() {
        super(new ArrayStack<>(), new IntegerOperators());
    }
}

