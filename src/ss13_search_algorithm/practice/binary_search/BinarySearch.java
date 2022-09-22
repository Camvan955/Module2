package ss13_search_algorithm.practice.binary_search;

public class BinarySearch {
    static int[] arr = {1, 3, 5, 7, 9, 12, 15, 16, 21, 25};

    static int binarySearch(int[] err, int key) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,21));
        System.out.println(binarySearch(arr,10));
        System.out.println(binarySearch(arr,9));
    }
}


