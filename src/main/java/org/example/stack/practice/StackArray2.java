package org.example.stack.practice;

import org.example.stack.ArrayStack;

/**
 * ClassName: Stack
 * Package: org.example.stack.practice
 * Description:
 *
 * @Author: Howard
 * @Create: 2025/2/24
 */
public class StackArray2 {

    private int stacksize;
    private int top  = -1; // 頂部 初始值
    private int[] stack;

    private int[] maxStack;

    public StackArray2(int stacksize){
        this.stacksize = stacksize;
        stack =new int[this.stacksize];
        maxStack =new int[this.stacksize];
    }

    //push
    public void push(int value){
        //先看有沒有滿
        if (isfull()){
            System.out.println("滿了");
            return;
        }
        //如果沒滿
        top++;
       stack[top] = value;

        if (top == 0) {
            maxStack[top] = value; // 初始化最大值棧
        } else {
            maxStack[top] = Math.max(maxStack[top - 1], value);
        }

    }

    public boolean isfull(){
        return top == stacksize-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int pop() {
        if (isEmpty()){
            System.out.println("空了");
        }
        int value =stack[top];
        top --;
        return value;
    }

    public void list(){
        if (isEmpty()){
            System.out.println("棧為空");
            return;
        }

        for (int i =top ;i >=0; i--){
            System.out.printf(i+":"+stack[i]+",");
        }
    }

    public int getMax() {
        if (isEmpty()) {
            throw new RuntimeException("棧是空的");
        }
        return maxStack[top];
    }


    public static void main(String[] args) {
        StackArray2 stackArray2=new StackArray2(2);
        stackArray2.push(1);
        stackArray2.push(2);
        stackArray2.list();
        System.out.println(stackArray2.getMax());
    }

}
