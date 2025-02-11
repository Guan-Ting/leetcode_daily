package org.example.stack;

import java.util.Scanner;

/**
 * ClassName: ArrayStackDemo
 * Package: org.example.stack
 * Description:
 *
 * @Author: Howard
 * @Create: 2025/2/11
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrStack = new ArrayStack(4);
        String key = "";
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while(loop) {
            System.out.println("s(show): 顯示棧 | a(add): 添加數據到棧中 | d(del): 將數據從棧中移出 | e(exit): 退出程序");
            key = sc.next();
            switch (key) {
                case "s":
                    arrStack.list();
                    break;
                case "e":
                    sc.close();
                    loop = false;
                    break;
                case "a":
                    System.out.println("請輸入要添加的數據: ");
                    int data = sc.nextInt();
                    arrStack.push(data);
                    break;
                case "d":
                    try {
                        int res = arrStack.pop();
                        System.out.printf("出棧的數據為 %d\n",res);
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                default:
                    break;
            }

        }
        System.out.println("程序退出!");
    }




}
