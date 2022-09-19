package ss11_dsa_stack_queue.exercise.use_map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;


public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String sc = scanner.nextLine();
        String[] sc1 = sc.split(" ");

//        System.out.println(Arrays.toString(sc1));


        for(String i: sc1) {
            if(!map.containsKey(i)) {
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        System.out.println(map);

    }
}
