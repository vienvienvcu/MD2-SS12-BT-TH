package BT2;

import java.util.Scanner;
import java.util.Stack;

public class CheckStack<T> {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();

        char a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (a == '[' || a == '{' || a == '(') {
                stack.push(a + "");
            } else if (a == ')' || a == ']' || a == '}') {
               if (!stack.isEmpty()) {
                   if (!stack.get(i).equals(a)) {
                       break;
                   }
               }
            }
        }
        System.out.println(stack);

    }

}
