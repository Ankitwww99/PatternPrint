/*
A
B B
C C C
D D D D
E E E E E
 */

import java.util.Scanner;

public class right_alphabatic_triangle_row {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+65-1)+" ");
            }
            System.out.println();
        }
    }
}
