package app;

import cs121.*;

public class NodeEvaluator extends AbstractEvaluator<Integer> {
    public NodeEvaluator() {
        super(new NodeStack<>(), new IntegerOperators());
    }
}
