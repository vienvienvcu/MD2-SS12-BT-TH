package BT9;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        create Stack object
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter decimal number:");
        int number = sc.nextInt();
        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number = number / 2;
        }
        System.out.println("Binary representation is: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
