package ss11_dsa_stack_queue.exercise.reverse_element;


import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.print("nhập vào phần tử thứ " + (i + 1) + ": ");
            int element = Integer.parseInt(sc.nextLine());
            integers.add(element);
        }
        System.out.println(integers);

        for (Integer integer : integers) {
            stack.push(integer);
        }
        integers.clear();
        int number = stack.size();

        System.out.print("Mảng sau khi đã đảo ngược là: ");
        for (int i = 0; i < number; i++) {
            integers.add(stack.pop());
        }
        System.out.println(integers);
    }
}

