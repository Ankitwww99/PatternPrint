/*

n=number of lines(height)
n=5

  1
 1*2
1*2*3
 1*2
  1

*/


import java.util.Scanner;

public class diamond_number_space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        n=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0)
                    System.out.print("*");
                else{
                    System.out.print(p);
                    p++;
                }
            }
            System.out.println();
        }
        n=n-1;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            int p=1;
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0)
                    System.out.print("*");
                else{
                    System.out.print(p);
                    p++;
                }
            }
            System.out.println();
        }
    }
}
