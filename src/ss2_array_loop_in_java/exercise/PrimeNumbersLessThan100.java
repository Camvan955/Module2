package ss2_array_loop_in_java.exercise;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int n = 2;
        int value = 100;
        while (n < value) {
            int number = 0;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    number += 1;
                }
            }
            if (number == 0) {
                System.out.println(n);
            }
            n++;
        }
    }
}
