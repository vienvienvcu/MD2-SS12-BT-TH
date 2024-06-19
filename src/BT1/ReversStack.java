package BT1;

import java.util.Stack;

public class ReversStack{
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        System.out.println("Is my stack empty" + stack.isEmpty());
        stack.push("hello");
        stack.push("nguyen vien");
        stack.push("welcome");
        stack.push("to");
        stack.push("japan");
        System.out.println("Elements in Stack:" + stack);
        while(!stack.isEmpty()){
            stack.pop();
            stack.clear();
            System.out.println("Elements in Stack:" + stack);
        }

    }



}
