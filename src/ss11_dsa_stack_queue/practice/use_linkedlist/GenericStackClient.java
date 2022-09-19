package ss11_dsa_stack_queue.practice.use_linkedlist;

import static ss11_dsa_stack_queue.practice.use_linkedlist.MyGenericStack.stackOfIStrings;
import static ss11_dsa_stack_queue.practice.use_linkedlist.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }


}
