package ss14_sort_algorithm.exercise.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static int[] arr = {4, 2, 6, 5, 9, 2, 7};

    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            System.out.println("Gán giá trị của x tại vị trí thứ " + i +": x= " + array[i]);
            pos = i;
            System.out.println("Đặt pos ở vị trí thứ "+ i);
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                System.out.println("Đổi chỗ " + pos + " với " + (pos -1));
                pos--;
                System.out.println("Giảm poss 1 đơn vị");
            }
            array[pos] = x;
            System.out.println("Gán vị trí của " + array[pos] +  " bằng " + x);
        }
    }
    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println("Mảng sau khi được sắp xếp là: "+Arrays.toString(arr));
    }


}
