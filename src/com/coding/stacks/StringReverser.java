package com.coding.stacks;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}

