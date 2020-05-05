import java.util.Scanner;

public class diamond_star {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        n=n-1;
        for(int i=n;i>=1;i--){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
