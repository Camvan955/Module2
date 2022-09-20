package test.queue_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> string = new LinkedList<>();
        string.offer("VAN");
        string.offer("mai");
        string.offer("hien");
        System.out.println(string);
    }
}
