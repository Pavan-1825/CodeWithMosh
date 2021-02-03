package com.coding.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    private final List rightBrackets = Arrays.asList(')', '}', ']', '>');
    private final List leftBrackets = Arrays.asList('(', '{', '[', '<');

    public boolean isBalanced(String input) {
        Stack<Character> charStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                charStack.push(ch);
            }
            if (isRightBracket(ch)) {
                if (charStack.isEmpty()) return false;

                char top = charStack.pop();
                if (!isBracketMatched(top, ch)) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isBracketMatched(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
