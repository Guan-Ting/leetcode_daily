package org.example.stack;

/**
 * ClassName: ArrayStack
 * Package: org.example.stack
 * Description:
 *
 * @Author: Howard
 * @Create: 2025/2/11
 */
public class ArrayStack {

        private int maxSize; // 棧大小
        private int[] stack; // 陣列
        private int top =-1; //棧頂 初始化 為 -1

        public ArrayStack(int maxSize){
            this.maxSize = maxSize;
            stack = new int[this.maxSize];
        }

        //判斷 stack 是滿的
        public boolean isFull(){
            return top == maxSize-1;
        }

        public boolean isEmpty(){
            return top ==-1;
        }

        //把東西 放到 stack
        public void push (int value){
            if (isFull()){
                System.out.println("stack 滿了");
                return ;
            }
            top++;
            stack[top] = value;

        }

    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("棧空");
        }
        int value = stack[top];
        top--;
        return value;
    }

        public void list(){
            if (isEmpty()){
                System.out.println("棧為空");
                return;
            }

            for (int i = top; i >=0 ; i--) {
                System.out.printf("stack[%d] = %d\n", i , stack[i]);
            }
        }

    public static void main(String[] args) {
        ArrayStack arrayStack =new ArrayStack(3);


        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.list();
    }

}
