package ss11_dsa_stack_queue.practice.stack_use_array;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int e) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = e;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return --index;
    }

    boolean isEmpty() {
        if (index == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        if (index == size) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return index;
    }
}
