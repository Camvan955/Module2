package ss11_dsa_stack_queue.practice.stack_use_array;

public class StackClient {

    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Độ dài của ngăn xếp: " + stack.size());
        System.out.println("Độ dài của ngăn xếp sau khi dùng pop: " + stack.pop());

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println();
        System.out.println("độ dài cuối cùng: " + stack.size());
    }
}

