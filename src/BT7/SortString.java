package BT7;

import java.util.Scanner;
import java.util.Stack;

public class SortString {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi");
        String str = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch + "");
            if(stack.peek().compareTo(str) > 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("chuoi giam dan");
        }else {
            System.out.println("chuoi ko giam dan");
        }
    }

}
