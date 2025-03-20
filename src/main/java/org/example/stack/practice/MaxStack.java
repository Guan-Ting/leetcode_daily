package org.example.stack.practice;

import java.util.Stack;

/**
 * ClassName: MaxStack
 * Package: org.example.stack.practice
 * Description:
 *
 * @Author: Howard
 * @Create: 2025/2/24
 */
public class MaxStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public int pop() {
        if (stack.peek().equals(maxStack.peek())) {
            maxStack.pop();
        }
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMax() {
        return maxStack.peek();
    }
}
