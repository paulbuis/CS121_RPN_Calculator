package app;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReversePolishNotationCalculator {

    static final Pattern pattern = Pattern.compile(
            "(-?[0-9]+)|(\\+|\\*|-|/|%)|(/s+)");
    static final Pattern numberPattern = Pattern.compile("-?[0-9]+");
    static final Pattern operatorPattern = Pattern.compile("\\+|\\*|-|/|%");
    static final Pattern spacePattern = Pattern.compile("/s+");

    static boolean isNumber(String s) {
        return numberPattern.matcher(s).matches();
    }

    static boolean isSpace(String s) {
        return spacePattern.matcher(s).matches();
    }

    static boolean isOperator(String s) {
        return operatorPattern.matcher(s).matches();
    }



    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        Scanner keyboard = new Scanner(System.in);

        while (keyboard.hasNext(pattern)) {
            String next = keyboard.next(pattern);

            if (isNumber(next)) {
                int number = Integer.parseInt(next);
                // TODO: Add code here
            } else if (isOperator(next)) {
                // TODO: Add code here
            } else if (isSpace(next)) {
                continue;
            } else {
                break;
            }

            System.out.println("Debug: " + evaluator);
        }
        System.out.println("Result=" + evaluator.getResult());
    }
}
