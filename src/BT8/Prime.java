package BT8;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.Stack;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <String> stack = new Stack<>();
        System.out.println("Enter number: ");
        String n = sc.nextLine();
        boolean isPrime = true;
        for(int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if(Character.isDigit(ch) ){
               stack.push(String.valueOf(ch));
            }
        }
        System.out.println(stack);
        int head = Integer.parseInt(String.valueOf(stack.peek()));
        for(int i = 2; i < head; i++){
            if(head % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }


}
