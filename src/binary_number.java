/*
10101
01010
10101
01010
10101
 */

import java.util.Scanner;

public class binary_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i%2==1){
                    if(j%2==0)
                        System.out.print(0);
                    else
                        System.out.print(1);
                }
                else{
                    if(j%2==0)
                        System.out.print(1);
                    else
                        System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
