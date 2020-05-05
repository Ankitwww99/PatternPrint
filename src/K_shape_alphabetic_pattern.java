/*
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
import java.util.Scanner;

public class K_shape_alphabetic_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print((char)(j+65-1)+" ");
            }
            System.out.println();
        }
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print((char)(j+65-1)+" ");
            }
            System.out.println();
        }


    }
}
