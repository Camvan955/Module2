package ss3_array_method_in_java.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {28, 14, 35, 19};
        int[] arr2 = {17, 40, 23};
        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length+i] = arr2[i];
        }

        System.out.print("Mang sau khi gop la: "+ Arrays.toString(arr));

    }
}
