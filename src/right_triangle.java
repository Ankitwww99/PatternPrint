import java.util.Scanner;

public class right_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        int a=0,b=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(b+" " );
                int c=a;
                a=b;
                b=b+c;
            }
            System.out.println();
        }

    }
}
