package ss11_dsa_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Palindrome {
    private static String str = "vaV";

    public static void main(String[] args) {
        str = str.toLowerCase();
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i) + "");
        }

        for (int i = 0; i < str.length(); i++) {
            stringQueue.add(str.charAt(i) + "");
        }

        for (int i = 0; i < str.length(); i++) {
            if (!stringStack.pop().equals(stringQueue.poll())) {
                System.out.println("this isn't Palindrome");
                return;
            }
        }
        System.out.println("this is Palindrome");

    }
}



