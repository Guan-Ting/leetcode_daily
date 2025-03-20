package org.example.stack.practice;

import java.util.Stack;

/**
 * ClassName: MaxStack2
 * Package: org.example.stack.practice
 * Description:
 *
 * @Author: Howard
 * @Create: 2025/2/24
 */
public class MaxStack2 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxStack = new Stack<>();


    //push

    public void push (Integer a){

        if (maxStack.isEmpty() || a > maxStack.peek()){
            maxStack.push(a);
        }
        stack.push(a);
    }
    //pop

    public Integer pop(){
        if (stack.peek().equals(maxStack.peek())){
            maxStack.pop();
        }
        return stack.pop();
    }
    //getMax

    public Integer getMax(){
        return maxStack.peek();
    }
    //getTop

    public Integer getTop(){
        return stack.peek();
    }

}
