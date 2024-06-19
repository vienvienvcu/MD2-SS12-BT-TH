package BT3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        String str = scanner.nextLine();
        char a;
        Queue<String> queue = new LinkedList<>();
        for (int i = str.length()-1 ; i >= 0 ; i--) {
                 a = str.charAt(i);
                 queue.add(String.valueOf(a));

        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (str.equals(reverseString)) {
            System.out.println("chuoi doi xuong");
        }else {
            System.out.println("ko phai chuoi doi xuong");
        }
    }
}
