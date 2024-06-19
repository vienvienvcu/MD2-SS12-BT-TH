package BT6;

import java.util.LinkedList;
import java.util.Queue;

public class MinQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int [] array = {2,3,4,10,-4,6,9};

        for (int i = 0; i < array.length; i++) {
            int min = array[0];
            if (min > array[i]) {
                min = array[i];
                queue.add(min);

            }
        }
        System.out.println(queue.poll());
    }

}
