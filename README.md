# Lab 9 - Reverse Polish Notation Calculator

## Step 0 - Get Code From GitHub

Start a new IntelliJ project by fetching my
code from 

```
https://github.com/paulbuis/CS121_RPN_Calculator.git
```

## Step 1 - See How NodeStack works

Take a look at `Stack.java` and then take
a look at `NodeStack.java` which `implements` the
`Stack<T>` interface.

Run `StackDemo.main()` to see how values
are pushed on a stack and then read off
of the stack before performing an arithmetic operation.

## Step 2 - See how an Evaluator works

In the `app` package, we have an example
that uses a `Stack<Integer>`. Take a look
at `Evaluator` and `EvaluatorDemo`.

Note that an `Evaluator` has-a `Stack<Integer>`.

Note that it does a `push()` when an operand is added.

Note that it does a pair of `top()` / `pop()` operations
when it processes an operator.

Run the `EvaluatorDemo` to see how this works.

## Get the RPN Calculator working

Your assignment is to make a couple of modifications
to the `main()` method in `ReversePolishNotationCalculator`.

What it does now is accept a sequence of space-separated numbers and operators, and ignores the spaces.

What we want it to do is:

* hand numbers as `int` operands to the evaluator, and
* hand operators as `Sting` operators to the evaluator.

### Verify that this works:

Run the program with this one-line as input:
```
2 3 +
```
You should get `5`

Run the program with this 3-lines as input:
```
2
3
+
```
You should get the exact same result as before.

Run the program with this 5-lines as input:
```
2000 4 %
2000 100 %
2000 400 %
+
+
```

This should produce a result of zero.