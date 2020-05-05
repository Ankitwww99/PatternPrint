/*
1
10
101
1010
10101
 */

import java.util.Scanner;

public class right_binary_number_triangle_col {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(j%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
