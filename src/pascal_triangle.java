/*
                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1
 */
import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for (int i = 0; i <n ; i++) {
            int number = 1;
            for (int j = n; j>i-1 ; j--) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
