/*
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
 */


import java.util.Scanner;

public class triangle_alphabetic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(j+65-1)+" ");
            }
            System.out.println();
        }
    }
}
