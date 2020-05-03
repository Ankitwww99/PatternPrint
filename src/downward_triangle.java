import java.util.Scanner;

public class downward_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        for (int i=1; i<=n; i++) {
            for (int j = 0; j <=n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
