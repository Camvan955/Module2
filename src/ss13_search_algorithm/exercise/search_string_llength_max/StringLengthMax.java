package ss13_search_algorithm.exercise.search_string_llength_max;

import java.util.LinkedList;
import java.util.Scanner;


public class StringLengthMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi bất kì: ");
        String str = sc.nextLine();


        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> string = new LinkedList<>();
            string.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > string.getLast()) {
                    string.add(str.charAt(j));
                }
                else
                    break;
            }
            if (string.size() > max.size()) {
                max.clear();
                max.addAll(string);
            }
            string.clear();
        }
        for (Character character : max) {
            System.out.print(character);
        }
        }
    }

