package com.coding.stacks;

public class StringStackTest {

    public static void main(String[] args) {
        String str = "{{[1]1}2}";
        StringReverser sr = new StringReverser();
        BalancedExpression be = new BalancedExpression();
        System.out.println(be.isBalanced(str));
        System.out.println(sr.reverse(str));
    }
}
