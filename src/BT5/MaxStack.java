package BT5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MaxStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int [] arr = {10,20,3,60,6,8};
        for (int i = 0; i < arr.length; i++) {
            if (stack.empty() || arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
        System.out.println("phan tu lon nhat cua mang la :" + stack.pop());
    }
}
