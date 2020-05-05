/*
Diamond alphabetic hollow
     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
 */

import java.util.Scanner;

public class diamond_alphabetic_hollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1)
                    System.out.print((char)(i+65-1));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        n=n-1;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1)
                    System.out.print((char)(i+65-1));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

